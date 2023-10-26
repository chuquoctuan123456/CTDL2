package hw4_21000710_chuquoctuan.ex2;

public interface StackInterface<E> extends Iterable<E>{
    public void push(E element);
    public E pop();
    public boolean isEmpty();
    public E top();
    public void print();
}
