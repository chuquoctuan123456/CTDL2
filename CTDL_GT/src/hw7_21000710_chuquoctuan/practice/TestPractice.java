package hw7_21000710_chuquoctuan.practice;

public class TestPractice {
    public static void main(String[] args) {
        OperationWithSearchBinaryTree<OperationWithSearchBinaryTree.Node> tree = new OperationWithSearchBinaryTree<>();
        OperationWithSearchBinaryTree.Node root = new OperationWithSearchBinaryTree.Node(5);
        tree.setRoot(root);
        // Thêm các giá trị vào cây
        tree.insert(3,root);
        tree.insert(8, root);
        tree.insert(1, root);
        tree.insert(4,root);
        tree.insert(6, root);
        tree.insert(9, root);
        tree.insert(2,root);
        tree.insert(7, root);

        System.out.println("In-order traversal of the tree at first:");
        tree.print(root);
        System.out.println();
        System.out.println("Median : " + tree.findMedian(root));

        System.out.println("Count Element : " + tree.countElement(3 ,8 ,root));

        System.out.println("Smallest Element 3 : " + tree.findSmallestElement(3 ,root));

        System.out.println("Largest Element 3 : " + tree.findLargestElement(3 ,root));


    }
}
