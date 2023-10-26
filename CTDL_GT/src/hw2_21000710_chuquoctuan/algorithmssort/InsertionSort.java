package hw2_21000710_chuquoctuan.algorithmssort;

public class InsertionSort implements SimpleSortingAlgorithm {
    public void sort(int[] array) {
        int countSwap = 0;
        int countCompare = 0;

        for (int i = 1; i < array.length ; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                countSwap++;
                countCompare++;
            }
            array[j + 1] = key;
        }


        System.out.println("Count Swap : " + countSwap);
        System.out.println("Count Compare : " + countCompare);

    }

    @Override
    public void sortVersion2(int[] array) {
        for (int i = 1; i < array.length ; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
