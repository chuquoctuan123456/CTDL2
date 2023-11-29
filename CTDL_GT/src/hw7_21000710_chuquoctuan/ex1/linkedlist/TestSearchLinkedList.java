package hw7_21000710_chuquoctuan.ex1.linkedlist;

import java.util.Random;

public class TestSearchLinkedList {
    public static void main(String[] args) {
        Random random = new Random();

        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10) + 1;
            simpleLinkedList.add(rand);
        }
        simpleLinkedList.printNode();

        System.out.println(simpleLinkedList.searchNoSorted(11));
        System.out.println(simpleLinkedList.searchSorted(5));

        simpleLinkedList.printNode();
    }
}
