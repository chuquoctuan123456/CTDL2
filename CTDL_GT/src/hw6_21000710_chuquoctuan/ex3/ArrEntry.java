package hw6_21000710_chuquoctuan.ex3;

public class ArrEntry<K, E> implements Entry<K, E> {
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
