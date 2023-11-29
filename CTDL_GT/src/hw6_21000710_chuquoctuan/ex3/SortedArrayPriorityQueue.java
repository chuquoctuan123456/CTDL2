package hw6_21000710_chuquoctuan.ex3;

public abstract class SortedArrayPriorityQueue<K extends Comparable ,E> {
    public abstract int size();

    public abstract boolean isEmpty();

    public abstract void insert(Entry<K, E> entry);

    public abstract void insert(K k, E e);

    public abstract Entry<K, E> removeMin();

    public abstract Entry<K, E> min();
}
