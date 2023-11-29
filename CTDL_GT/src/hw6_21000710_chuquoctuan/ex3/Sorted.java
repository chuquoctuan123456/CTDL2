package hw6_21000710_chuquoctuan.ex3;

import java.util.Arrays;

public class Sorted<K extends Comparable ,E> {
    private ArrEntry<K ,E>[] array;

    private void swap(ArrEntry<K ,E>[] arr ,int i, int j){
        ArrEntry<K ,E> temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void setArr(ArrEntry<K, E>[] arr) {
        this.array = arr;
    }

    public ArrEntry<K ,E>[] copyArray(){
        ArrEntry<K ,E>[] copy = new ArrEntry[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public void print(ArrEntry<K ,E>[] array){
        for (int i = 0; i < array.length ; i++) {
            if(i == array.length - 1){
                System.out.print(array[i].getKey() + " : " + array[i].getValue());
            }else{
                System.out.print(array[i].getKey() + " : " + array[i].getValue() + " , ");
            }
        }
        System.out.println();
    }
    public void heapSort( ArrEntry<K ,E>[] arr ){
        long startTime = System.nanoTime();
        MinHeapQueue<K ,E> heap = new MinHeapQueue();

        for (int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
        }
        ArrEntry<K ,E>[] sortedArray = new ArrEntry[arr.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = (ArrEntry<K ,E>) heap.removeMin();
        }
        arr = sortedArray;
        long endTime = System.nanoTime();
        System.out.println("Time run : " + (endTime - startTime));
        print(arr);
    }

    public void bubbleSort( ArrEntry<K ,E>[] arr ){
        if(arr.length <= 0){
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j].getKey().compareTo(arr[j + 1].getKey()) > 0){
                    swap(arr ,j ,j + 1);
                }
            }
        }
        print(arr);
    }
    public void insertionSort( ArrEntry<K ,E>[] arr ){
        if(arr.length <= 0){
            return;
        }
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            ArrEntry<K ,E> key = (ArrEntry<K ,E>)arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j].getKey().compareTo(key.getKey()) > 0){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        print(arr);
    }
    public void selectionSort( ArrEntry<K ,E>[] arr ) {
        if(arr.length <= 0){
            return;
        }
        int n = arr.length;
        int minIdx = 0;
        for (int i = 0; i < n - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].getKey().compareTo(arr[minIdx].getKey()) < 0) {
                    minIdx = j;
                }
            }
            swap(arr ,minIdx ,i);
        }
        print(arr);
    }
    public void mergeSort(ArrEntry<K ,E>[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public  void merge(ArrEntry<K ,E>[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        ArrEntry<K ,E>[] L = Arrays.copyOfRange(arr, left, mid + 1);
        ArrEntry<K ,E>[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].getKey().compareTo(R[j].getKey()) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public void quickSort(ArrEntry<K ,E>[]  arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public int partition(ArrEntry<K ,E>[] arr, int low, int high) {
        ArrEntry<K ,E> pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].getKey().compareTo(pivot.getKey()) < 0) {
                i++;

                ArrEntry<K ,E> temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        ArrEntry<K ,E> temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void timeRunBubbleSort(){
        long startTime = System.nanoTime();
        bubbleSort(array);
        long endTime = System.nanoTime();
        System.out.println("Time run : " + ( endTime - startTime));
    }

    public void timeRunInsertionSort(){
        long startTime = System.nanoTime();
        insertionSort(array);
        long endTime = System.nanoTime();
        System.out.println("Time run : " + ( endTime - startTime));
    }

    public void timeRunSelectionSort(){
        long startTime = System.nanoTime();
        bubbleSort(array);
        long endTime = System.nanoTime();
        System.out.println("Time run : " + ( endTime - startTime));
    }
    public void timeRunQuickSort(){
        long startTime = System.nanoTime();
        quickSort(array ,0 ,array.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Time run : " + ( endTime - startTime));
    }
    public void timeRunMergeSort(){
        long startTime = System.nanoTime();
        mergeSort(array ,0 , array.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Time run : " + ( endTime - startTime));
    }
    public void timeRunHeapSort(){
        long startTime = System.nanoTime();
        mergeSort(array ,0 , array.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Time run : " + ( endTime - startTime));
    }




}
