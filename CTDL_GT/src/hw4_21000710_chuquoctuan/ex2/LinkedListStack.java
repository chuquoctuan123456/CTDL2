package hw4_21000710_chuquoctuan.ex2;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
    class Node {
        E element;
        Node next;
    }

    private Node stack = null;
    private int size = 0;

    @Override
    public void push(E element) {
        Node node = new Node();
        node.element = element;
        if (isEmpty()) {
            stack = node;
            node.next = null;

        } else {
            node.next = stack;
            stack = node;
        }
        size++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        Node node = new Node();
        node = stack.next;
        stack = node;
        size--;
        return stack.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return stack.element;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto - generated method stub
        return new StackIterator();
    }

    class StackIterator implements Iterator<E> {
        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            // TODO Auto - generated method stub
            return currentNode != null;
        }

        @Override
        public E next() {
            // TODO Auto - generated method stub
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }

    public void print() {
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
