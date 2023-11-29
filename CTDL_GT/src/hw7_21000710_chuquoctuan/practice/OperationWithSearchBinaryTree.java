package hw7_21000710_chuquoctuan.practice;

import hw7_21000710_chuquoctuan.ex2.SearchBinaryTree;

import java.util.ArrayList;
import java.util.List;


// Practice 3 , 4 ,5 ,6
public class OperationWithSearchBinaryTree<T> {
    protected static class Node{
        private int element;
        private Node left;
        private Node right;

        public Node(int element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }

        public int getElement() {
            return element;
        }
    }
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insert(int x , T p){
       Node node = (Node) p;
        if(node == null){
            return new Node(x);
        }

        if(node.element - x > 0){
            node.left = insert(x , (T) node.left);
        }
        if(node.element - x < 0){
            node.right = insert(x , (T) node.right);
        }
        return node;
    }
    // In-order
    private void inOrder(T p , List<Integer> list){

        Node node = (Node) p;
        if(node == null){
            return;
        }
        inOrder((T)node.left , list);
        list.add(node.element);
        inOrder((T)node.right ,list);
    }
    // Practice 3
    public double findMedian(T p){
        List<Integer> list = new ArrayList<>();
        inOrder(p ,list);
        if(list.size() % 2 == 0){
            return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2.0;
        }
        return list.get(list.size() / 2);
    }

    // Practice 4
    public int countElement(int start ,int end ,T p){
        List<Integer> list = new ArrayList<>();
        inOrder(p ,list);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= start && list.get(i) <= end){
                count++;
            }
        }
        return count;
    }
    // Practice 5
    public int findSmallestElement(int k ,T p){
        List<Integer> list = new ArrayList<>();
        inOrder(p ,list);
        return list.get(k - 1);
    }
    // Practice 6
    public int findLargestElement(int k ,T p){
        List<Integer> list = new ArrayList<>();
        inOrder(p ,list);
        return list.get(list.size() - k);
    }
    // In-order
    public void print(T p){
        Node node = (Node) p;
        if(node == null){
            return;
        }
        print((T)node.left);
        System.out.print(node.element + " ");
        print((T)node.right);
    }


}
