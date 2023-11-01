package hw5_21000710_chuquoctuan.practice4;

public class CountLeavesInBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int countLeaves(Node node){
        if(node == null){
            return 0;
        } else if (node.right == null && node.left == null) {
            return 1;
        }else {
            int countLeft = countLeaves(node.left);
            int countRight = countLeaves(node.right);
            return countRight + countLeft;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(9);
        root.right = new Node(10);

        root.left.left = new Node(14);
        root.left.right = new Node(15);

        root.left.left.right = new Node(15);
        root.left.left.left = new Node(15);

        System.out.println("Count leaves of tree : " + countLeaves(root));
    }
}
