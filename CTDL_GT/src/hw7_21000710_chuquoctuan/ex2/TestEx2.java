package hw7_21000710_chuquoctuan.ex2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestEx2 {
    public static void main(String[] args) {
       // testSearchBinaryTree();
        testTimeRunSearch();
    }
    public static void  testSearchBinaryTree(){
        SearchBinaryTree<Integer, SearchBinaryTree.Node<Integer>> tree = new SearchBinaryTree<>();
        SearchBinaryTree.Node<Integer> root = new SearchBinaryTree.Node<>(5);
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

        System.out.println("Min tree : " + tree.findMin().getElement());
        System.out.println("Find element : " + tree.search(6 ,root));

        tree.delete(9 ,root);
        tree.delete(3 ,root);

        System.out.println("In-order traversal of the tree after delete :");
        tree.print(root);

    }
    public static void testTimeRunSearch(){
        TimeRunSearch timeRunSearch = new TimeRunSearch();
        int[] array = randomArray();
        int[] clone1 = copyArray(array);
        int[] clone2 = copyArray(array);

        timeRunSearch.setArray(array);
        timeRunSearch.timeSearchBinary(3);

        timeRunSearch.setArray(clone1);
        timeRunSearch.timeSearchBinaryTree(3);

        timeRunSearch.setArray(clone2);
        timeRunSearch.timeSearchSequential(3);
    }
    public static int[] randomArray(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1000) + 1;
        }
        return array;

    }

    public static int[] copyArray(int[] array){
        int[] copy = Arrays.copyOf(array, array.length);
        return copy;
    }
}
