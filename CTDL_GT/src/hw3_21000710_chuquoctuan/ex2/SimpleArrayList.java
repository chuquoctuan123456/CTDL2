package hw3_21000710_chuquoctuan.ex2;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        this.n = capacity;
    }

    @Override
    public void add(T data) {
        if (array.length <= n) {
            int newLength = array.length * 2;
            array = Arrays.copyOf(array, newLength);
        }
        array[n] = data;
        n++;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= n) {
            return null;
        }
        return array[i];
    }

    @Override
    public void set(int i, T data) {
        if (i >= n || i < 0) {
            return;
        }
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if(array[i] == data){
                for (int j = i; j < n -1 ; j++) {
                    array[j] = array[j + 1];
                }
                n--;
            }
        }
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if(array[i].equals(data)){
                return true;
            }
        }
        return false;
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
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }
    class ArrayIterator implements Iterator<T>{
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < n;
        }

        @Override
        public T next() {
            if(!hasNext()){
                return null;
            }
            T element = array[currentIndex];
            currentIndex++;
            return element;
        }
    }
    public void print(){
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
