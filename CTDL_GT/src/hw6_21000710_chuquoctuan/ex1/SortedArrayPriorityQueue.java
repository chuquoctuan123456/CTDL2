package hw6_21000710_chuquoctuan.ex1;

import java.util.Arrays;
public class SortedArrayPriorityQueue<K extends Comparable ,E> implements PriorityQueueInterface {
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
    ArrEntry<K ,E>[] array;
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
        if(array == null){
            array = new ArrEntry[defaultsize];
            array[n] = (ArrEntry<K ,E>) entry;
            n++;
            return;
        }

        if(n == array.length){
            ArrEntry<K ,E>[] copyArray = Arrays.copyOf(array , 2 * n);
            array = copyArray;
        }

        K key = (K) entry.getKey();
        int minIdx = 0;

        for(int i = 0 ;i < n ;i++){
            if(array[i].key.compareTo(key) > 0){
                minIdx = i;
                break;
            }else{
                minIdx = n;
            }
        }
        ArrEntry<K, E>[] newArray = new ArrEntry[array.length + 1];

        for (int i = 0; i < minIdx; i++) {
            newArray[i] = array[i];
        }

        newArray[minIdx] = (ArrEntry<K, E>) entry;

        for (int i = minIdx + 1; i < n + 1; i++) {
            newArray[i] = array[i - 1];
        }

        array = newArray;
        n++;
    }

    @Override
    public void insert(Object o1, Object o2) {
        insert(new ArrEntry<>(o1 ,o2));
    }

    @Override
    public Entry removeMin() {
        if(isEmpty()){
            return null;
        }
        int minIdx = 0;
        for (int i = 0; i < n; i++) {
            if(array[i].key.compareTo(array[minIdx].key) < 0) {
                minIdx = i;
            }
        }
        ArrEntry<K ,E> min = array[minIdx];
        for (int i = minIdx; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = null;
        n--;
        return min;
    }

    @Override
    public Entry min() {
        if(isEmpty()){
            return null;
        }
        int minIdx = 0;
        for (int i = 0; i < n; i++) {
            if(array[i].key.compareTo(array[minIdx].key) < 0) {
                minIdx = i;
            }
        }
        return array[minIdx];
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
