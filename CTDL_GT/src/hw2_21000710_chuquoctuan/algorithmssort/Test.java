package hw2_21000710_chuquoctuan.algorithmssort;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        test1();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Excution time");
        test2();
    }


    public static void test1(){
        int[] array = randomArray(6);
        ManagerSortSimpleAlgorithm manager = new ManagerSortSimpleAlgorithm();

        System.out.println("Bubble sort version 1 : ");
        manager.setSortingAlgorithm(new BubbleSort());
        int[] clone1 = copy(array);
        manager.setArray(clone1);
        System.out.println("After array");
        manager.print();
        manager.sort();
        System.out.println("Excution time : " + manager.excutionTimeSimpleSort());
        System.out.println("Before array");
        manager.print();

        System.out.println("\nBubble sort version 2 : ");
        manager.setSortingAlgorithm(new BubbleSortVersion2());
        int[] clone2 = copy(array);
        manager.setArray(clone2);
        System.out.println("After array");
        manager.print();
        manager.sort();
        System.out.println("Excution time : " + manager.excutionTimeSimpleSort());
        System.out.println("Before array");
        manager.print();

        System.out.println("\nSelection sort : ");
        manager.setSortingAlgorithm(new SelectionSort());
        int[] clone3 = copy(array);
        manager.setArray(clone3);
        System.out.println("After array");
        manager.print();
        manager.sort();
        System.out.println("Excution time : " + manager.excutionTimeSimpleSort());
        System.out.println("Before array");
        manager.print();

        System.out.println("\nInsertion sort : ");
        manager.setSortingAlgorithm(new InsertionSort());
        int[] clone4 = copy(array);
        manager.setArray(clone4);
        System.out.println("After array");
        manager.print();
        manager.sort();
        System.out.println("Excution time : " + manager.excutionTimeSimpleSort());
        System.out.println("Before array");
        manager.print();

        System.out.println("\nQuick sort : ");
        manager.setEffectiveSortingAlgorithm(new QuickSort());
        int[] clone5 = copy(array);
        manager.setArray(clone5);
        System.out.println("After array");
        manager.print();
        System.out.println("Excution time : " + manager.excutionTimeEffectiveSort());
        System.out.println("Count compare " + manager.getEffectiveSortingAlgorithm().getCountCompare());
        System.out.println("Count swap " + manager.getEffectiveSortingAlgorithm().getCountSwap());
        System.out.println("Before array");
        manager.print();

        System.out.println("\nMerge sort : ");
        manager.setEffectiveSortingAlgorithm(new MergeSort());
        int[] clone6 = copy(array);
        manager.setArray(clone6);
        System.out.println("After array");
        manager.print();
        System.out.println("Excution time : " + manager.excutionTimeEffectiveSort());
        System.out.println("Count compare " + manager.getEffectiveSortingAlgorithm().getCountCompare());
        System.out.println("Count swap " + manager.getEffectiveSortingAlgorithm().getCountSwap());
        System.out.println("Before array");
        manager.print();
    }
    public static void test2() throws Exception {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Public\\Code\\Java\\CTDL_GT\\src\\hw2_21000710_chuquoctuan\\algorithmssort\\data.txt");

            ManagerSortSimpleAlgorithm manager = new ManagerSortSimpleAlgorithm();

            int[] n = {100 ,1000 ,10000 ,100000};

            for (int i = 0; i < n.length; i++) {
                System.out.printf("Number = %s :\n", n[i]);
                fw.write("Number = ");
                fw.write(Integer.toString(n[i]));
                fw.write("\n");
                manager.setNumber(n[i]);

                manager.setSortingAlgorithm(new BubbleSort());
                System.out.println("Bubble version 1 sort : " + manager.averageTimeSimpleSort() + "ms");
                fw.write(Double.toString(manager.averageTimeSimpleSort()));
                fw.write("\n");

                manager.setSortingAlgorithm(new BubbleSortVersion2());
                System.out.println("Bubble version 2 sort : " + manager.averageTimeSimpleSort() + "ms");
                fw.write(Double.toString(manager.averageTimeSimpleSort()));
                fw.write("\n");

                manager.setSortingAlgorithm(new SelectionSort());
                System.out.println("Selection sort : " + manager.averageTimeSimpleSort() + "ms");
                fw.write(Double.toString(manager.averageTimeSimpleSort()));
                fw.write("\n");

                manager.setSortingAlgorithm(new SelectionSort());
                System.out.println("InsertionSort sort : " + manager.averageTimeSimpleSort() + "ms");
                fw.write(Double.toString(manager.averageTimeSimpleSort()));
                fw.write("\n");

                manager.setEffectiveSortingAlgorithm(new QuickSort());
                System.out.println("Quick sort : " + manager.averageTimeEffective() + "ms");
                fw.write(Double.toString(manager.averageTimeEffective()));
                fw.write("\n");

                manager.setEffectiveSortingAlgorithm(new MergeSort());
                System.out.println("Merge sort : " + manager.averageTimeEffective() + "ms");
                fw.write(Double.toString(manager.averageTimeEffective()));
                fw.write("\n");

                System.out.println();
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static int[] randomArray(int number){
        int[] rand = new int[number];
        Random random = new Random();
        for(int i = 0; i < rand.length ;i++){
            rand[i] = random.nextInt(1000000) + 1;
        }
        return rand;
    }
    public static int[] copy(int[] array){
        int[] copy = Arrays.copyOf(array ,array.length);
        return copy;
    }




}