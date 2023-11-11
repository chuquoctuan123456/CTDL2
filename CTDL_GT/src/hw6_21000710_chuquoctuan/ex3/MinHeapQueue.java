package hw6_21000710_chuquoctuan.ex3;


import java.util.Arrays;

public class MinHeapQueue<K extends Comparable ,E> extends SortedArrayPriorityQueue<K, E> {
     private ArrEntry<K ,E>[] heapPQ;
     private int n ;

     public MinHeapQueue() {
          this.heapPQ = (ArrEntry<K, E>[]) new ArrEntry[10];
          this.n = 0;
     }

     protected void upHeap(){
         int i = n;
         while(i > 1 && heapPQ[i / 2].getKey().compareTo(heapPQ[i].getKey()) > 0){
              swap(i / 2 ,i);
              i = i / 2;
         }
     }
     private void swap(int i,int j){
          ArrEntry<K ,E> temp = heapPQ[i];
          heapPQ[i] = heapPQ[j];
          heapPQ[j] = temp;
     }
     protected void downHeap(){
          heapPQ[1] = heapPQ[n];
          int i = 1;
          while(i < n){
               if(2*i + 1 < n){
                    if(heapPQ[i].getKey().compareTo(heapPQ[2*i].getKey()) < 0 && heapPQ[i].getKey().compareTo(heapPQ[2*i + 1].getKey()) < 0){
                         break;
                    }else{
                         int j = 0;
                         if(heapPQ[2*i].getKey().compareTo(heapPQ[2*i + 1].getKey()) < 0){
                              j = 2*i;
                         }else{
                              j = 2*i + 1;
                         }
                         swap(i ,j);
                         i = j;
                    }
               }else{
                    if(2*i < n){
                         if(heapPQ[i].getKey().compareTo(heapPQ[2*i].getKey()) > 0){
                              swap(i ,2*i);
                         }
                    }
                    break;
               }
          }
     }

     public void print( ArrEntry<K ,E>[] array){
          for (int i = 0; i < array.length ; i++) {
               if(i == array.length - 1){
                    System.out.print(array[i].getKey() + " : " + array[i].getValue());
               }else{
                    System.out.print(array[i].getKey() + " : " + array[i].getValue() + " , ");
               }
          }
          System.out.println();
     }

     @Override
     public int size() {
          return n;
     }

     @Override
     public boolean isEmpty() {
          return n == 0;
     }

     @Override
     public void insert(Entry<K, E> entry) {
          if(isEmpty()){
               heapPQ[1] = (ArrEntry<K ,E>) entry;
               n++;
               return;
          }
          if (n >= heapPQ.length) {
               heapPQ = Arrays.copyOf(heapPQ, heapPQ.length * 2);
          }
          n++;
          heapPQ[n] = (ArrEntry<K, E>) entry;
          upHeap();
     }

     @Override
     public void insert(K k, E e) {
          insert(new ArrEntry<>(k ,e));
     }

     @Override
     public Entry<K, E> removeMin() {
          if (isEmpty()) {
               return null;
          }

          ArrEntry<K, E> min = heapPQ[1];

          if (n > 0) {
               heapPQ[1] = heapPQ[n];
               downHeap();
               n--;
          }

          return min;
     }

     @Override
     public Entry<K, E> min() {
          return heapPQ[1];
     }
     public ArrEntry<K ,E>[] copyArray(){
          ArrEntry<K ,E>[] copy = new ArrEntry[n];
          for (int i = 0; i < n; i++) {
               copy[i] = heapPQ[i + 1];
          }
          return copy;
     }


}
