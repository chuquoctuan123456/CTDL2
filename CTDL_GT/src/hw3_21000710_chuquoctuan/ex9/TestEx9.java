package hw3_21000710_chuquoctuan.ex9;

public class TestEx9 {
    public static void main(String[] args) {
        CountElement countElement = new CountElement();

        countElement.addNode(9);
        countElement.addNode(6);
        countElement.addNode(4);
        countElement.addNode(1);
        countElement.addNode(1);
        countElement.printNode();
        countElement.countElement(1);

    }
}
