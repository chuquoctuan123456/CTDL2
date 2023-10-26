package hw3_21000710_chuquoctuan.ex3;

import hw3_21000710_chuquoctuan.ex5.OperationLinkedList;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        Node node = new Node();
        node.next = null;
        node.data = data;
        if (top == null) {
            top = node;
            bot = node;
        } else {
            bot.next = node;
            bot = node;
        }
        n++;
    }

    public void addBot(T data) {
        Node node = new Node();
        node.data = data;
        node.next = top;
        top = node;
        n++;

    }

    public T get(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException("Error index");
        }
        Node node = top;
        for (int j = 0; j < i - 1; j++) {
            node = node.next;
        }
        return top.data;
    }

    public void set(int i, T data) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException("Error index");
        }
        if (i == 0) {
            top.data = data;
            return;
        }
        Node node = top;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        node.data = data;
    }

    public boolean isContain(T data) {
        Node node = top;
        for (int j = 0; j < n; j++) {
            if ((node.data).equals(data)) {
                return true;
            }
            node = node.next;

        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public T removeTop() {
        if (n == 0) {
            return null;
        }
        Node node = new Node();
        node.data = top.next.data;
        node.next = top.next.next;
        top = node;
        n--;
        return node.data;

    }

    public T removeBot() {
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            T removedData = top.data;
            top = null;
            bot = null;
            n--;
            return removedData;
        }
        Node prev = null;
        Node curr = top;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        T removedData = curr.data;
        prev.next = null;
        bot = prev;
        n--;
        return removedData;
    }

    public void remove(T data) {
        if (data.equals(bot.data)) {
            removeBot();
            return;
        }
        if (data.equals(top.data)) {
            removeTop();
            return;
        }
        Node prev = top;
        Node curr = top.next;

        while (curr != null) {
            if (data.equals(curr.data)) {
                // Remove Node present by update Node before
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    public void printNode(){
       Node node = top;
        while(node != null){
            System.out.print(node.data);
            node = node.next;
            if(node != null){
                System.out.print("-->");
            }else{
                System.out.println();
            }
        }
    }
}