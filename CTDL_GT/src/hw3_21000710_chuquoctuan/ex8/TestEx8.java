package hw3_21000710_chuquoctuan.ex8;


public class TestEx8 {
    public static void main(String[] args) {
        NthNodeFromEndOfLinkedList list = new NthNodeFromEndOfLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);
        list.addNode(9);
        list.printNode();
        list.findElementFromTailToHead(2);

    }
}
