package hw6_21000710_chuquoctuan.ex3;


import java.util.Arrays;

public class TestEx3 {
    public static void main(String[] args) {
        Sorted<Integer, String> sorter = new Sorted<>();

        Sorted.ArrEntry[] arr = new Sorted.ArrEntry[9];

        arr[0] = sorter.new ArrEntry<>(5,"A");
        arr[1] = sorter.new ArrEntry<>(4,"B");
        arr[2] = sorter.new ArrEntry<>(9,"C");
        arr[3] = sorter.new ArrEntry<>(10,"D");
        arr[4] = sorter.new ArrEntry<>(11,"E");
        arr[5] = sorter.new ArrEntry<>(12,"F");
        arr[6] = sorter.new ArrEntry<>(3,"J");
        arr[7] = sorter.new ArrEntry<>(5,"H");
        arr[8] = sorter.new ArrEntry<>(1,"T");

        Sorted.ArrEntry[] clone1 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use bubble sort : ");
        sorter.setArr(clone1);
        sorter.print(clone1);
        System.out.println("After sort use bubble sort : ");
        sorter.bubbleSort(clone1);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        Sorted.ArrEntry[] clone2 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use insertion sort : ");
        sorter.setArr(clone2);
        sorter.print(clone2);
        System.out.println("After sort use insertion sort : ");
        sorter.insertionSort(clone2);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        Sorted.ArrEntry[] clone3 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use selection sort : ");
        sorter.setArr(clone3);
        sorter.print(clone3);
        System.out.println("After sort use selection sort : ");
        sorter.selectionSort(clone3);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        Sorted.ArrEntry[] clone4 = Arrays.copyOf(arr ,arr.length);
        System.out.println("Before sort use heap sort : ");
        sorter.setArr(clone4);
        sorter.print(clone4);
        System.out.println("After sort use heap sort : ");
        sorter.heapSort(clone4);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}
