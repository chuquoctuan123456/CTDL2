package hw3_21000710_chuquoctuan.ex14;

public class TestEx14 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addHead(1);
        list.addHead(9);
        System.out.println(list.getSize());
        list.printNode();
        list.addTail(2);
        list.add(99 ,1);
        list.printNode();

        list.removeHead();
        list.printNode();
        list.removeTail();
        list.printNode();
        list.addHead(10);
        list.addHead(16);
        list.printNode();
        list.remove(2);
        list.printNode();

        list.addHead(1);
        list.addHead(2);
        list.printNode();
        list.remove(3);

        list.printNode();

    }
}
