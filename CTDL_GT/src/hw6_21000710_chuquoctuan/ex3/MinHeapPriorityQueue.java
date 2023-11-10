package hw6_21000710_chuquoctuan.ex3;

import hw6_21000710_chuquoctuan.ex2.Entry;
import hw6_21000710_chuquoctuan.ex2.SortedArrayPriorityQueue;

import java.util.Arrays;

public class MinHeapPriorityQueue<K extends Comparable ,E> extends SortedArrayPriorityQueue<K, E> {
     private ArrEntry<K ,E>[] heapPQ;
     private int n ;

     public MinHeapPriorityQueue() {
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
          n--;
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
//     private void swap(ArrEntry<K ,E> key1 ,ArrEntry<K ,E> key2){
//          ArrEntry<K ,E> temp = key1;
//          key1 = key2;
//          key2 = temp;
//     }
     public void print(){
          for (int i = 1; i <= n ; i++) {
               if(i == n){
                    System.out.print(heapPQ[i].getKey() + " : " + heapPQ[i].getValue());
               }else{
                    System.out.print(heapPQ[i].getKey() + " : " + heapPQ[i].getValue() + " , ");
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
     public void insert(hw6_21000710_chuquoctuan.ex2.Entry<K, E> entry) {
          if(isEmpty()){
               heapPQ[1] = (ArrEntry<K ,E>) entry;
               n++;
               return;
          }
          if (n >= heapPQ.length) {
               heapPQ = Arrays.copyOf(heapPQ, heapPQ.length * 2);
          }
          n++;
          heapPQ[n ] = (ArrEntry<K, E>) entry;
          upHeap();
     }

     @Override
     public void insert(K k, E e) {
          insert(new ArrEntry<>(k ,e));
     }

     @Override
     public hw6_21000710_chuquoctuan.ex2.Entry<K, E> removeMin() {
          if (isEmpty()) {
               return null;
          }

          ArrEntry<K, E> min = heapPQ[1];
          n--;

          if (n > 0) {
               heapPQ[1] = heapPQ[n];
               downHeap();
          }

          return min;
     }

     @Override
     public Entry<K, E> min() {
          return heapPQ[1];
     }
}
