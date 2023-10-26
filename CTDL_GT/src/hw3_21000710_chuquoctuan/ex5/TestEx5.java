package hw3_21000710_chuquoctuan.ex5;

public class TestEx5 {
    public static void main(String[] args) {
        OperationLinkedList<Integer> list = new OperationLinkedList<>();
        list.addNodeHead(1);
        list.addNodeHead(9);
        System.out.println(list.getSize());
        list.printNode();
        list.addNodeTail(2);
        list.addNode(99 ,1);
        list.printNode();

        list.removeHead();
        list.printNode();
        list.removeTail();
        list.printNode();
        list.addNodeHead(10);
        list.addNodeHead(16);
        list.printNode();
        list.remove(2);
        list.printNode();

        list.addNodeHead(1);
        list.addNodeHead(2);
        list.printNode();
        list.removeElement(3);

        list.printNode();
    }
}
