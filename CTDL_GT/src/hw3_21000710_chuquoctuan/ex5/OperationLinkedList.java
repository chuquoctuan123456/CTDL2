package hw3_21000710_chuquoctuan.ex5;

// Exercise 22 ,23 ,29
public class OperationLinkedList<E> {
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

    public void addNodeHead(E element) {
        Node head = new Node();
        head.next = headNode;
        head.data = element;
        headNode = head;
        size++;
    }
    public void addNodeTail(E element ) {
        Node node = headNode;
        while(node.next != null){
            node = node.next;
        }
        Node tailNode = new Node();
        tailNode.next = null;
        tailNode.data = element;
        node.next = tailNode;
        size++;

    }
    public void addNode(E element ,int k) {
        if(k == 0){
            addNodeHead(element);
        }
        if(k == size){
            addNodeTail(element);
        }
        if(k > size || k < 0){
            return;
        }
        Node node = headNode;
        Node newNode = new Node();
        for (int i = 0; i < k - 1; i++) {
            node = node.next;
        }
        newNode.next = node.next;
        newNode.data = element;
        node.next = newNode;
        size++;
    }
    public void removeHead(){
        if(size <= 0 || headNode == null){
            return;
        }

        Node node = headNode.next;
        headNode = node;
        size--;
    }
    public void removeTail(){
        if(headNode == null){
            return;
        }
        Node node = headNode;
        for (int i = 0; i < size - 2; i++) {
            node = node.next;
        }
        node.next = null;
        size--;
    }
    public void remove(int k){
        if(k == 0){
            removeHead();
        }
        if(k == size){
            removeTail();
        }
        if(k > size || k < 0){
            return;
        }
        Node node = headNode;
        for (int i = 0; i < k - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }
    // Remove element with values greater than k
    public void removeElement(int k){
        Node node = headNode;

        int count = 0;
        for (int i = 0; i < size; i++) {
            int temp = (int)node.data;
            if(temp > k){
                remove(i - count);
                count++;
            }
            node = node.next;
        }
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
