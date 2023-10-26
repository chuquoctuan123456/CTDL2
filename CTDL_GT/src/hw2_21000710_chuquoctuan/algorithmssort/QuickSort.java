package hw2_21000710_chuquoctuan.algorithmssort;

public class QuickSort implements EffectiveSortingAlgorithm {
    private int countSwap ;
    private int countCompare ;
    public void sort(int[] array ,int low ,int high ) {
        int idx;
        if(low < high){
            idx = partition(array ,low ,high);
            sort(array ,low ,idx - 1 );
            sort(array ,idx + 1 ,high );
        }
    }
    private int partition(int[] array, int low, int high ) {
        int key = array[high];
        int i = low - 1;
        for(int j = low ;j < high ;j++){
            countCompare++;
            if(key > array[j]){
                i++;
                swap(array ,i ,j);
            }
        }
        swap(array ,i + 1 ,high);

        return i + 1;
    }
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        countSwap++;
    }

    public int getCountSwap() {
        return countSwap;
    }

    public int getCountCompare() {
        return countCompare;
    }
}
