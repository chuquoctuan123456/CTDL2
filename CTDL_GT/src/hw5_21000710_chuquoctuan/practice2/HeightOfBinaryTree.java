package hw5_21000710_chuquoctuan.practice2;

public class HeightOfBinaryTree {
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
    public static int findHeightUtil(Node node){
        if(node == null) return -1;

        // Height of left subling tree
        int leftHeight = findHeightUtil(node.left);
        // Height of right subling tree
        int rightHeight = findHeightUtil(node.right);

        // Height max of tree is height max(left,right) + 1
        return Math.max(leftHeight ,rightHeight) + 1;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(9);
        root.right = new Node(10);

        root.left.left = new Node(14);
        root.left.right = new Node(15);

        root.left.left.right = new Node(15);

        System.out.println("Height of tree : " + findHeightUtil(root));
    }


}
