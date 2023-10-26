package hw5_21000710_chuquoctuan.ex2;

import java.util.NoSuchElementException;

public class LinkedBinaryTree<E, T> {
    protected static class Node<E> {

        protected E element; // an element stored at this node
        private Node<E> parent; // a reference to the parent node (if any)
        private Node<E> left; // a reference to the left child
        private Node<E> right; // a reference to the right child

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }

    private Node<E> root;
    private int size = 0;

    // T is Node ,E is value of node
    public T root() {
        return (T) root;
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int numChildren(T p) {
        if(p == null){
            return -1;
        }
        int count = 0;
        if(left(p) != null){
            count++;
        }
        if(right(p) != null){
            count++;
        }
        return count;
    }


    public T parent(T p) {
        Node<E> node = (Node<E>) p;
        if(node == null || node.parent == null){
            return null;
        }

        return (T) node.parent;
    }

    public T left(T p) {
        Node<E> node = (Node<E>) p;
        if(node == null || node.left == null){
            return null;
        }

        return (T) node.left;
    }


    public T right(T p) {
        Node<E> node = (Node<E>) p;
        if(node == null || node.right == null){
            return null;
        }

        return (T) node.right;
    }


    public T sibling(T p) {
        Node<E> node = (Node<E>) p;
        if(node == null || node.parent == null ){
            return null;
        }
        Node<E> nodeParent = node.parent;
        if(nodeParent.left == node){
            return (T) nodeParent.right;
        }

        return (T) nodeParent.left;
    }

    // update methods
    public Node<E> addRoot(E element) {
        // Add element to root of an empty tree
        if(root == null){
            root = new Node<>(element ,null ,null ,null);
            size = 1;
        }else{
            root.element = element;
        }
        return root;


    }

    public Node<E> addLeft(Node p, E element) {
        // Add element to left child node of p if empty
        Node<E> node;
        if(p.left == null){
            node = new Node<>(element ,p ,null ,null);
            p.left = node;
            size ++;
        }else{
            throw new NoSuchElementException("Node isn't empty");
        }
        return node;
    }

    public Node<E> addRight(Node p, E element) {
        // Add element to right child node of p if empty
        Node<E> node;
        if(p.right == null){
            node = new Node<>(element ,p ,null ,null);
            p.right = node;
            size++;
        }else {
            throw new NoSuchElementException("Node isn't empty");
        }
        return node;
    }
    public void set ( Node p , E element ) {
        // set element to node p
        p.element = element;
    }

}