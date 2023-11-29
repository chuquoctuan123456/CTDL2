package hw7_21000710_chuquoctuan.ex2;

public class TimeRunSearch {
    private int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void timeSearchBinaryTree(int key){
        SearchBinaryTree<Integer, SearchBinaryTree.Node<Integer>> tree = new SearchBinaryTree<>();
        SearchBinaryTree.Node<Integer> root = new SearchBinaryTree.Node<>(array[0]);
        tree.setRoot(root);
        for (int i = 1; i < array.length; i++) {
            tree.search(array[i] ,root);
        }
        long startTime = System.nanoTime();
        tree.search(key ,root);
        long endTime = System.nanoTime();
        System.out.println("Time run of search binary tree : " + (endTime - startTime));
    }
    private boolean searchSequential(int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return true;
            }
        }
        return false;
    }
    public void timeSearchSequential(int key){
        long startTime = System.nanoTime();
        searchSequential(key);
        long endTime = System.nanoTime();
        System.out.println("Time run of search Sequential : " + (endTime - startTime));
    }

    private boolean searchBinary(int key){
        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (array[m] == key)
                return true;

            if (array[m] < key)
                l = m + 1;

            else
                r = m - 1;
        }
        return false;
    }
    public void timeSearchBinary(int key){
        long startTime = System.nanoTime();
        searchBinary(key);
        long endTime = System.nanoTime();
        System.out.println("Time run of search Sequential : " + (endTime - startTime));
    }


}
