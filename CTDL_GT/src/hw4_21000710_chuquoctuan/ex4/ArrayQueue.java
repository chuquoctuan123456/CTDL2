package hw4_21000710_chuquoctuan.ex4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements QueueInterface<E>{
    private E[] queue;
    private int n = 0;
    private int top = 0;
    private int count = 0;
    private int default_size = 100;

    public ArrayQueue(int capacity) {
        n = capacity;
        queue = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        n = default_size;
        queue = (E[]) new Object[default_size];
    }

    @Override
    public void enqueue(E element) {
        if(n == count){
            E[] temp =  (E[]) new Object[n * 2];
            System.arraycopy(queue, 0, temp, 0, count);
            queue = temp;
            n = n * 2;
        }
        queue[(top + count) % n] = element;
        count++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        E data = queue[top];
        top = (top + 1) % n;
        count--;
        return data;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayQueueIterator();
    }

    class ArrayQueueIterator implements Iterator<E>{
        private int currentIndex = top;
        private int num = 0;
        @Override
        public boolean hasNext() {
            return num < count;
        }

        @Override
        public E next() {
            E data = queue[(currentIndex + num) % n];
            num++;
            return data;
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
