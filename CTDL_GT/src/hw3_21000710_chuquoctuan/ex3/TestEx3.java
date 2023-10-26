package hw3_21000710_chuquoctuan.ex3;

public class TestEx3 {
    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.printNode();

        list.removeTop();
        list.removeBot();
        list.printNode();

    }
}
