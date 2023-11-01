package hw5_21000710_chuquoctuan.ex2;

public class TestEx2 {
    public static void main(String[] args) {
        testPrint();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
        infixTest();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++\n");
        testCalculate();
    }
    public static void testPrint(){
        LinkedBinaryTree<Integer ,LinkedBinaryTree.Node<Integer>> linkedBinaryTree = new LinkedBinaryTree<>();
        LinkedBinaryTree.Node<Integer> root = linkedBinaryTree.addRoot(1);

        LinkedBinaryTree.Node<Integer> left1 = linkedBinaryTree.addLeft(root ,10);
        LinkedBinaryTree.Node<Integer> right1 = linkedBinaryTree.addRight(root ,20);

        LinkedBinaryTree.Node<Integer> left2 = linkedBinaryTree.addLeft(left1 ,30);
        LinkedBinaryTree.Node<Integer> right2 = linkedBinaryTree.addRight(left1 ,40);

        LinkedBinaryTree.Node<Integer> left3 = linkedBinaryTree.addLeft(right1 ,50);
        LinkedBinaryTree.Node<Integer> right3 = linkedBinaryTree.addRight(right1 ,60);

        LinkedBinaryTree.Node<Integer> left4 = linkedBinaryTree.addLeft(left2 ,70);
        LinkedBinaryTree.Node<Integer> right4 = linkedBinaryTree.addRight(left2 ,80);

        ExpressionTree<Integer> expressionTree = new ExpressionTree<>();

        System.out.println("Pre - order traversal of tree : ");
        expressionTree.preorderPrint(linkedBinaryTree.root());

        System.out.println("\nIn - order traversal of tree : ");
        expressionTree.inorderPrint(linkedBinaryTree.root());

        System.out.println("\nPost - order traversal of tree : ");
        expressionTree.postorderPrint(linkedBinaryTree.root());

    }
    public static void infixTest(){
        LinkedBinaryTree<String ,LinkedBinaryTree.Node<String>> linkedBinaryTree = new LinkedBinaryTree<>();
        LinkedBinaryTree.Node<String> root = linkedBinaryTree.addRoot("+");

        LinkedBinaryTree.Node<String> left1 = linkedBinaryTree.addLeft(root ,"+");
        LinkedBinaryTree.Node<String> right1 = linkedBinaryTree.addRight(root ,"*");

        LinkedBinaryTree.Node<String> left2 = linkedBinaryTree.addLeft(left1 ,"a");
        LinkedBinaryTree.Node<String> right2 = linkedBinaryTree.addRight(left1 ,"*");

        LinkedBinaryTree.Node<String> left3 = linkedBinaryTree.addLeft(right2 ,"b");
        LinkedBinaryTree.Node<String> right3 = linkedBinaryTree.addRight(right2 ,"c");

        LinkedBinaryTree.Node<String> left4 = linkedBinaryTree.addLeft(right1 ,"+");
        LinkedBinaryTree.Node<String> right4 = linkedBinaryTree.addRight(right1 ,"g");

        LinkedBinaryTree.Node<String> left5 = linkedBinaryTree.addLeft(left4 ,"*");
        LinkedBinaryTree.Node<String> right5 = linkedBinaryTree.addRight(left4 ,"f");

        LinkedBinaryTree.Node<String> left6 = linkedBinaryTree.addLeft(left5 ,"d");
        LinkedBinaryTree.Node<String> right6 = linkedBinaryTree.addRight(left5 ,"e");

        ExpressionTree<String> expressionTree = new ExpressionTree<>();

        System.out.println("\nPrefix traversal of tree : ");
        expressionTree.prefixPrint(linkedBinaryTree.root());

        System.out.println("\nInfix traversal of tree : ");
        expressionTree.infixPrint(linkedBinaryTree.root());

        System.out.println("\nPostfix traversal of tree : ");
        expressionTree.postfixPrint(linkedBinaryTree.root());

    }
    public static void testCalculate(){
        LinkedBinaryTree<String ,LinkedBinaryTree.Node<String>> linkedBinaryTree = new LinkedBinaryTree<>();

        LinkedBinaryTree.Node root = linkedBinaryTree.addRoot("*");

        LinkedBinaryTree.Node left1 = linkedBinaryTree.addLeft(root ,"+");
        LinkedBinaryTree.Node right1 = linkedBinaryTree.addRight(root ,"-");

        LinkedBinaryTree.Node left2 = linkedBinaryTree.addLeft(left1 ,"/");
        LinkedBinaryTree.Node right2 = linkedBinaryTree.addRight(left1 ,"2");

        LinkedBinaryTree.Node left3 = linkedBinaryTree.addLeft(left2 ,"6");
        LinkedBinaryTree.Node right3 = linkedBinaryTree.addRight(left2 ,"3");

        LinkedBinaryTree.Node left4 = linkedBinaryTree.addLeft(right1 ,"7");
        LinkedBinaryTree.Node right4 = linkedBinaryTree.addRight(right1 ,"4");

        ExpressionTree<String> expressionTree = new ExpressionTree<>();
        System.out.println("Expression : ");
        expressionTree.infixPrint(linkedBinaryTree.root());
        System.out.println("\nResult : ");
        System.out.println(expressionTree.calculate(linkedBinaryTree.root()));

    }
}
