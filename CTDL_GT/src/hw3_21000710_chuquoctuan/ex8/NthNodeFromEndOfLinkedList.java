package hw3_21000710_chuquoctuan.ex8;

import hw3_21000710_chuquoctuan.ex5.OperationLinkedList;
import hw3_21000710_chuquoctuan.ex9.CountElement;

public class NthNodeFromEndOfLinkedList<E>{

        // Create Class Node
        class Node{
            E data;
            Node next;
        }
        private Node headNode ;
        private int size;

        public Node getHeadNode() {
            return headNode;
        }

        public void setHeadNode(Node headNode) {
            this.headNode = headNode;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }


    public void addNode(E element ) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = null;

        if(headNode == null){
            headNode = newNode;
        }else{
            Node tailNode = headNode;
            while(tailNode.next != null){
                tailNode = tailNode.next;
            }
            tailNode.next = newNode;
        }
        size++;
    }
    public void findElementFromTailToHead(int k){
        if(k >= size || k < 0){
            System.out.println("Again input k : ");
            return;
        }
        Node node = headNode;
        for (int i = 0; i < size - k; i++) {
            node = node.next;
        }
        System.out.println(node.data);

    }
    public void printNode(){
        Node node = headNode;
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
