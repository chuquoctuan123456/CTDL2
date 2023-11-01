package hw5_21000710_chuquoctuan.ex2;


import java.util.NoSuchElementException;

public class ExpressionTree<E> extends LinkedBinaryTree {
    public void preorderPrint(Node<E> p) {
        // pre - order traversal of tree with root p
        if (p == null) {
            return;
        }
        System.out.print(p.element + " ");
        preorderPrint(p.getLeft());
        preorderPrint(p.getRight());
    }

    public void postorderPrint(Node<E> p) {
        // post - order traversal of tree with root p
        if (p == null) {
            return;
        }

        postorderPrint(p.getLeft());
        postorderPrint(p.getRight());
        System.out.print(p.element + " ");
    }

    public void inorderPrint(Node<E> p) {
        //in - order traversal of tree with root p
        if (p == null) {
            return;
        }

        inorderPrint(p.getLeft());
        System.out.print(p.element + " ");
        inorderPrint(p.getRight());

    }
    // Print prefix : tiền tố
    public void prefixPrint(Node<E> p){
        if(p == null){
            return;
        }
        System.out.print(p.element + " ");
        preorderPrint(p.getLeft());
        preorderPrint(p.getRight());

    }

    // Print infix : trung tố
    public void infixPrint(Node<E> p) {
        if(p.getLeft() != null){
            System.out.print("(");
            infixPrint(p.getLeft());
        }

        System.out.print(p.element + " ");

        if(p.getRight() != null){
            infixPrint(p.getRight());
            System.out.print(")");
        }
    }
    // Print postFix : hậu tố
    public void postfixPrint(Node<E> p){
        if(p == null){
            return;
        }
        postorderPrint(p.getLeft());
        postorderPrint(p.getRight());
        System.out.print(p.element + " ");
    }
    public double calculate(Node<E> p){
        if(p == null){
            return 0.0;
        }
        // If element of node is operand ,return values
        if(p.getLeft() == null){
            String value = p.element.toString();
            return Double.parseDouble(value);
        }else{
            // post order
            double x = calculate(p.getLeft());
            double y = calculate(p.getRight());
            String operator = p.getElement().toString();

            if(operator.equals("+")){
                return x + y;
            } else if (operator.equals("-")) {
                return x - y;
            } else if (operator.equals("/")) {
                if(y == 0){
                    throw new NoSuchElementException("Error devide of 0 :");
                }else{
                    return x / y;
                }

            }
            return x * y;
        }
    }

}
