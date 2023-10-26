package hw2_21000710_chuquoctuan.ex4;

import java.util.Random;
import java.util.Scanner;

public class MinNumber {
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

    private static void quickSort(int[] array, int low, int high) {
        int idx;
        if (low < high) {
            idx = partition(array, low, high);
            quickSort(array, low, idx - 1);
            quickSort(array, idx + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int key = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {

            if (key > array[j]) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int minNumber(int[] array) {
        quickSort(array, 0, array.length - 1);
        int idx = 0;
        int number = 0;

        while (true) {
            if (number == array[array.length - 1]) {
                return number + 1;
            }
            if(number < array[idx] && idx == 0 ){
                return 0;
            }
            for (int j = idx ; j < array.length; j++) {
                if (number < array[j]) {
                    idx = j;
                    break;
                }
            }
            if (array[idx - 1] == number) {
                number++;
                continue;
            } else {
                return array[idx - 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] random = random(sc);
        System.out.println("Array random");
        print(random);

        System.out.println(minNumber(random));
        print(random);
    }
}
