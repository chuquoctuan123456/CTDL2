package hw2_21000710_chuquoctuan.sortdatawithgenerics;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        SortWithGeneric<Integer> sortInterger = new SortWithGeneric<>();
        Integer[] rand = { 1 ,6 ,5 ,4 ,6 ,9};

        Integer[] clone1 = copy(rand);
        Integer[] clone2 = copy(rand);
        Integer[] clone3 = copy(rand);

        System.out.println("Bubble sort type data is interger");
        sortInterger.setArray(clone1);
        sortInterger.print();
        sortInterger.bubbleSort();
        sortInterger.print();

        System.out.println("\nBubble sort version 2 type data is interger");
        sortInterger.setArray(clone2);
        sortInterger.print();
        sortInterger.bubbleSortVersion2();
        sortInterger.print();

        System.out.println("\nQuick sort type data is interger");
        sortInterger.setArray(clone3);
        sortInterger.print();
        sortInterger.quickSort(0 ,5);
        sortInterger.print();

        SortWithGeneric<Double> sortDouble = new SortWithGeneric<>();
        Double[] array = {9.0 ,10.5 ,11.1 ,10.22 ,9.3 ,6.486};

        Double[] clone4 = copy(array);
        Double[] clone5 = copy(array);
        Double[] clone6 = copy(array);

        System.out.println("Bubble sort type data is double");
        sortDouble.setArray(clone4);
        sortDouble.print();
        sortDouble.bubbleSort();
        sortDouble.print();

        System.out.println("\nBubble sort version 2 type data is double");
        sortDouble.setArray(clone5);
        sortDouble.print();
        sortDouble.bubbleSortVersion2();
        sortDouble.print();

        System.out.println("\nQuick sort type data is double");
        sortDouble.setArray(clone6);
        sortDouble.print();
        sortDouble.quickSort(0 ,5);
        sortDouble.print();
    }
    public static <T> T[] copy(T[] array){
        T[] copy = Arrays.copyOf(array ,array.length);
        return copy;
    }


}
