package hw4_21000710_chuquoctuan.ex4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements QueueInterface<E> {
    class Node{
        E element;
        Node next;
    }
    private Node head = null;
    private int size = 0;
    @Override
    public void enqueue(E element) {
        Node node = new Node();
        node.element = element;
        if(isEmpty()){
           head = node;
        }
        head.next = node;
        node.next = null;
        size++;

    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        E element = head.element;
        Node node = new Node();
        node.next = head.next;
        head = node;
        size--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListQueueIterator();
    }
    class LinkedListQueueIterator implements Iterator<E> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node node = head;
            for (int i = 0; i < currentIndex; i++) {
                node = node.next;
            }
            currentIndex++;
            return node.element;
        }
    }
    @Override
    public void print(){
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
