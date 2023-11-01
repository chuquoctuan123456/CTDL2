package hw5_21000710_chuquoctuan.practice14;

import hw5_21000710_chuquoctuan.practice2.HeightOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;

        }
    }
    public static void levelOrderPrint(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node currentNode = queue.poll();
            System.out.print(currentNode.data + " ");
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }

        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(9);
        root.right = new Node(10);

        root.left.left = new Node(14);
        root.left.right = new Node(15);

        root.left.left.right = new Node(15);

        System.out.println("Level order traversal binary tree : ");
        levelOrderPrint(root);
    }
}
