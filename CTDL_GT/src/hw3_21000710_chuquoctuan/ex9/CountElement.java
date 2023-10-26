package hw3_21000710_chuquoctuan.ex9;

import hw3_21000710_chuquoctuan.ex5.OperationLinkedList;

public class CountElement {
    class Node{
        int data;
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

    public void addNode(int element ) {
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
    public void countElement(int element){
        Node node = headNode;
        int count = 0;
        while(node != null){
            int temp = node.data;
            if(temp == element){
                count++;
            }
            node = node.next;
        }
        System.out.println(count);
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
