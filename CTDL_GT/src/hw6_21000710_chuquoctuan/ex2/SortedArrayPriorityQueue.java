package hw6_21000710_chuquoctuan.ex2;

import java.util.Arrays;
public abstract class SortedArrayPriorityQueue<K extends Comparable ,E> {
    protected class ArrEntry<K ,E> implements Entry<K ,E> {
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
    public abstract int size();

    public abstract boolean isEmpty();

    public abstract void insert(Entry<K, E> entry);

    public abstract void insert(K k, E e);

    public abstract Entry<K, E> removeMin();

    public abstract Entry<K, E> min();
}
