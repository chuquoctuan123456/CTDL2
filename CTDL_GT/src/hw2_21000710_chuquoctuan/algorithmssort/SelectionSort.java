package hw2_21000710_chuquoctuan.algorithmssort;

public class SelectionSort implements SimpleSortingAlgorithm {
    public void sort(int[] array) {
        int countSwap = 0;
        int countCompare = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                countCompare++;
                if (array[idx] > array[j]) {
                    idx = j;
                }
            }
            swap(array ,i ,idx);
            countSwap++;
        }
        System.out.println("Count Swap : " + countSwap);
        System.out.println("Count Compare : " + countCompare);
    }

    @Override
    public void sortVersion2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[idx] > array[j]) {
                    idx = j;
                }
            }
            swap(array ,i ,idx);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
