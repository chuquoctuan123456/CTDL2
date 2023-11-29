
package hw7_21000710_chuquoctuan.ex2;

public class SearchBinaryTree<E extends Comparable ,T> {
    protected static class Node<E>{
        private E element;
        private Node left;
        private Node right;

        public Node(E element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }

        public E getElement() {
            return element;
        }
    }
    private Node<E> root;

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }

    public Node<E> findMin(){
        Node node = root;
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
    private Node<E> findMax(T p){
        Node<E> node = (Node<E>)p;
        while(node.right != null){
            node = node.right;
        }
        return node;
    }


    public Node<E> insert(E x ,T p){
        Node<E> node = (Node<E>) p;
        if(node == null){
            return new Node(x);
        }

        if(node.element.compareTo(x) > 0){
            node.left = insert(x , (T) node.left);
        }
        if(node.element.compareTo(x) < 0){
            node.right = insert(x , (T) node.right);
        }
        return node;
    }
    public Node<E> delete(E x ,T p){
        Node<E> node = (Node<E>) p;
        // With tree empty or no find Node delete
        if(node == null){
            return null;
        }
        if(node.element.compareTo(x) > 0){
            node.left = delete(x ,(T) node.left);
        } else if (node.element.compareTo(x) < 0) {
            node.right = delete(x ,(T) node.right);
        }else{
            if(node.left == null && node.right == null){
                return null;
            }else{
                if(node.right == null){
                    return node.left;
                } else if (node.left == null) {
                    return node.right;
                }else {
                    node.element = findMax((T)node.left).element;
                    node.left = delete(node.element , (T)node.left);
                }
            }
        }
        return node;
    }
    // In-order
    public void print(T p){
        Node<E> node = (Node<E>) p;
        if(node == null){
            return;
        }
        print((T)node.left);
        System.out.print(node.element + " ");
        print((T)node.right);
    }
    // Search binary tree
    public boolean search(E x ,T p){
        Node<E> node = (Node<E>) p;
        while(node != null){
            if(node.element.compareTo(x) == 0){
                return true;
            } else if (node.element.compareTo(x) > 0) {
                node = node.left;
            }else {
                node = node.right;
            }
        }
        return false;
    }
}
