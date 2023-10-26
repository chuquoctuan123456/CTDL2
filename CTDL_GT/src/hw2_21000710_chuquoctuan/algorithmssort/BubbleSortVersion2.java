package hw2_21000710_chuquoctuan.algorithmssort;

public class BubbleSortVersion2 implements SimpleSortingAlgorithm {
    public void sort(int[] array) {
        int countSwap = 0;
        int countCompare = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean check = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                countCompare++;
                if (array[j] > array[j + 1]) {
                    swap(array ,j ,j + 1);
                    check = false;
                    countSwap++;
                }
            }
            if (check) {
                break;
            }
        }
        System.out.println("Count Swap : " + countSwap);
        System.out.println("Count Compare : " + countCompare);
    }
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void sortVersion2(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            boolean check = true;
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    swap(array ,j ,j + 1);
                    check = false;

                }
            }
            if (check) {
                break;
            }
        }

    }
}
