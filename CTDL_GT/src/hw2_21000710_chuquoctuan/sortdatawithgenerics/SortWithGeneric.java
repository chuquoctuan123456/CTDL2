package hw2_21000710_chuquoctuan.sortdatawithgenerics;

public class SortWithGeneric <T extends Comparable<T>>{
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    private <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array ,j ,j + 1);
                }
            }
        }

    }
    public void bubbleSortVersion2() {
        for (int i = 0; i < array.length - 1; i++) {
            boolean check = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array ,j ,j + 1);
                    check = false;
                }
            }
            if (check) {
                break;
            }
        }
    }
    public void insertionSort() {
        for (int i = 1; i < array.length ; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    public void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[idx].compareTo(array[j]) > 0) {
                    idx = j;
                }
            }
            swap(array ,i ,idx);
        }
    }
    public void quickSort(int low ,int high ) {
        int idx;
        if(low < high){
            idx = partition(low ,high);
            quickSort(low ,idx - 1 );
            quickSort(idx + 1 ,high );
        }
    }
    private int partition(int low, int high ) {
        T key = array[high];
        int i = low - 1;
        for(int j = low ;j < high ;j++){
            if(key.compareTo(array[j]) > 0){
                i++;
                swap(array ,i ,j);
            }
        }
        swap(array ,i + 1 ,high);
        return i + 1;
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
