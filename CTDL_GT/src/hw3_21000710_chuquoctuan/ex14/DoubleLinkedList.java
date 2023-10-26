package hw3_21000710_chuquoctuan.ex14;

import hw3_21000710_chuquoctuan.ex5.OperationLinkedList;
import hw3_21000710_chuquoctuan.ex9.CountElement;

public class DoubleLinkedList<E> {
    class Node{
        E data;
        Node prev;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;


    public int getSize() {
        return size;
    }
    public void addTail(E element){
        Node newNode = new Node();
        newNode.data = element;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void addHead(E element){
        Node newNode = new Node();
        newNode.data = element;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void add(E element ,int k){
        Node newNode = new Node();
        newNode.data = element;
        if(k == 0){
            addHead(element);
            return ;
        }
        if (k == size - 1){
            addTail(element);
            return;
        }
        Node nodeHead = head;
        for (int i = 0; i < k - 1; i++) {
            nodeHead = newNode.next;
        }
        newNode.next = nodeHead.next;
        newNode.prev = nodeHead;

        size++;
    }
    public void removeHead() {
        Node node = new Node();
        node.prev = null;
        node.next = head.next;
        node.data = head.next.data;
        head = node;
        size--;
    }
    public void removeTail() {
        Node node = new Node();
        node.next = null;
        node.prev = tail.prev;
        node.data = tail.prev.data;
        tail = node;
        size--;

    }

    public void remove(int k){
        if(k == 0){
            removeHead();
            return;
        }
        if(k == size){
            removeTail();
            return;
        }
        if(k > size || k < 0){
            return;
        }

        Node node = head;
        for (int i = 0; i < k - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }


    public void printNode(){
        Node node = head;
        while(node != null){
            System.out.print(node.data);
            node = node.next;
            if(node != null){
                System.out.print("<-->");
            }else{
                System.out.println();
            }
        }
    }
}
