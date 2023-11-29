package hw6_21000710_chuquoctuan.ex3;


import java.util.Arrays;

public class TestEx3 {
    public static void main(String[] args) {
        Sorted<Integer, String> sorter = new Sorted<>();

        ArrEntry[] arr = new ArrEntry[9];

        arr[0] = new ArrEntry<>(5,"A");
        arr[1] = new ArrEntry<>(4,"B");
        arr[2] = new ArrEntry<>(9,"C");
        arr[3] = new ArrEntry<>(10,"D");
        arr[4] = new ArrEntry<>(11,"E");
        arr[5] = new ArrEntry<>(12,"F");
        arr[6] = new ArrEntry<>(3,"J");
        arr[7] = new ArrEntry<>(5,"H");
        arr[8] = new ArrEntry<>(1,"T");

        ArrEntry[] clone1 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use bubble sort : ");
        sorter.setArr(clone1);
        sorter.print(clone1);
        System.out.println("After sort use bubble sort : ");
        sorter.timeRunBubbleSort();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrEntry[] clone2 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use insertion sort : ");
        sorter.setArr(clone2);
        sorter.print(clone2);
        System.out.println("After sort use insertion sort : ");
        sorter.timeRunInsertionSort();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrEntry[] clone3 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use selection sort : ");
        sorter.setArr(clone3);
        sorter.print(clone3);
        System.out.println("After sort use selection sort : ");
        sorter.timeRunSelectionSort();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrEntry[] clone4 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use heap sort : ");
        sorter.setArr(clone4);
        sorter.print(clone4);
        System.out.println("After sort use heap sort : ");
        sorter.timeRunHeapSort();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrEntry[] clone5 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use merge sort : ");
        sorter.setArr(clone5);
        sorter.print(clone5);
        System.out.println("After sort use merge sort : ");
        sorter.timeRunMergeSort();
        sorter.print(clone5);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrEntry[] clone6 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use quick sort : ");
        sorter.setArr(clone6);
        sorter.print(clone6);
        System.out.println("After sort use quick sort : ");
        sorter.quickSort(clone6 ,0 ,clone6.length - 1);
        sorter.timeRunQuickSort();
        sorter.print(clone6);

    }
}
