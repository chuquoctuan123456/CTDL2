package hw4_21000710_chuquoctuan.ex2;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<E> implements StackInterface<E>{
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    public ArrayStack(){
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public void push(E element) {
        if(t == data.length - 1){
            E[] newData = (E[]) new Object[data.length * 2];
            newData = Arrays.copyOf(data ,data.length - 1);
            data = newData;
        }
        data[t + 1] = element;
        t++;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            return null;
        }
        E temp = data[t];
        data[t] = null;
        t--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[0];
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }
    class StackIterator implements Iterator<E>{
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < t + 1;
        }

        @Override
        public E next() {
            if(!hasNext()){
                return null;
            }
            E element = data[currentIndex];
            currentIndex++;
            return element;
        }
    }
    public void print(){
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

}
