package hw6_21000710_chuquoctuan.ex1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UnsortedArrayPriorityQueue<K extends Comparable ,E> implements PriorityQueueInterface{
    protected class ArrEntry<K ,E> implements Entry<K ,E>{
        K key;
        E element;
        public ArrEntry(K k ,E e){
            key = k;
            element = e;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public E getValue() {
            return element;
        }
    }
    ArrEntry<K ,E> [] array ;
    int n = 0;
    int defaultsize = 1000;

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public void insert(Entry entry) {
        if (array == null) {
            array = new ArrEntry[defaultsize];
        }
        if(n == array.length){
            ArrEntry<K ,E> [] newArray = Arrays.copyOf(array , 2 * n);
            array = newArray;
        }

        array[n] = (ArrEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(Object k, Object e) {
       insert(new ArrEntry<>((K) k ,(E) e));
    }

    @Override
    public Entry removeMin() {
        if(isEmpty()){
            return null;
        }
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if(array[i].key.compareTo(array[minIndex].key) < 0){
                minIndex = i;
            }
        }
        ArrEntry<K, E> minEntry = array[minIndex];
        for (int i = minIndex; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = null;
        n--;
        return minEntry;
    }

    @Override
    public Entry min() {
        if(isEmpty()){
            return null;
        }
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            if(array[i].key.compareTo(array[minIndex].key) < 0){
                minIndex = i;
            }
        }
        return array[minIndex];
    }
    public void print(){
        for (int i = 0; i < n; i++) {
            if(i == n - 1){
                System.out.print(array[i].getKey() + " : " + array[i].getValue());
            }else{
                System.out.print(array[i].getKey() + " : " + array[i].getValue() + " , ");
            }
        }
        System.out.println();
    }
}
