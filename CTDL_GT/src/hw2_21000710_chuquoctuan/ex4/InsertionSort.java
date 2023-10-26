package hw2_21000710_chuquoctuan.ex4;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] array) {
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
    public static int[] random(Scanner sc) {
        System.out.println("Input length array");
        int length = sc.nextInt();
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] random = random(sc);
        System.out.println("Array random");
        print(random);
        sort(random);
        print(random);
    }
}
