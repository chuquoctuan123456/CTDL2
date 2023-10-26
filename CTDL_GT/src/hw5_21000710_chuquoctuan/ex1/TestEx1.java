package hw5_21000710_chuquoctuan.ex1;

public class TestEx1 {
    public static void main(String[] args) {
        testArrayBinaryTree();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        testLinkedBinaryTree();
    }
    public static void testArrayBinaryTree(){
        ArrayBinaryTree<Integer ,Integer> arrayBinaryTree = new ArrayBinaryTree<>();
        arrayBinaryTree.setRoot(1);

        arrayBinaryTree.setLeft(1 ,10);
        arrayBinaryTree.setRight(1 ,20);

        arrayBinaryTree.setLeft(2 ,40);
        arrayBinaryTree.setRight(2 ,50);

        arrayBinaryTree.setLeft(4 ,80);

        arrayBinaryTree.setLeft(5,100);
        arrayBinaryTree.setRight(5 ,110);

        arrayBinaryTree.print();

        System.out.println(arrayBinaryTree.numChildren(1));
        System.out.println(arrayBinaryTree.numChildren(6));
        System.out.println(arrayBinaryTree.numChildren(4));
        System.out.println(arrayBinaryTree.numChildren(5));

        System.out.println(arrayBinaryTree.sibling(4));

        System.out.println(arrayBinaryTree.parent(5));
        System.out.println(arrayBinaryTree.left(5));
        System.out.println(arrayBinaryTree.right(5));
    }
    public static void testLinkedBinaryTree(){
        LinkedBinaryTree<Integer ,LinkedBinaryTree.Node<Integer>> linkedBinaryTree = new LinkedBinaryTree<>();

        LinkedBinaryTree.Node<Integer> root = linkedBinaryTree.addRoot(1);
        LinkedBinaryTree.Node<Integer> left = linkedBinaryTree.addLeft(root ,10);
        LinkedBinaryTree.Node<Integer> right = linkedBinaryTree.addRight(root ,20);

        System.out.println("Element root : " + linkedBinaryTree.root().element);
        System.out.println("Element right of root : " + linkedBinaryTree.right(root).element);
        System.out.println("Size tree : " + linkedBinaryTree.size());

        linkedBinaryTree.addRight(right ,30);

        System.out.println("Element right of right : " + linkedBinaryTree.right(right).element);
        System.out.println("Number children of root : " + linkedBinaryTree.numChildren(root));
        System.out.println("Number children of right : " + linkedBinaryTree.numChildren(right));
        System.out.println("Number sibling of left : " + linkedBinaryTree.sibling(left).element);


    }
}
