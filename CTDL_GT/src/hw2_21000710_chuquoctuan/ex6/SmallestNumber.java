package hw2_21000710_chuquoctuan.ex6;

import java.util.Random;
import java.util.Scanner;

public class SmallestNumber {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[idx] > array[j]) {
                    idx = j;
                }
            }
            swap(array ,i ,idx);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int findNumber(int[] array ,int k){
        sort(array);
        return array[array.length - k - 1];
    }

    public static int[] random(Scanner sc){
        System.out.println("Input length array");
        int length = sc.nextInt();
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000) + 1;
        }
        return array;
    }

    public static void print(int[] array){
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

        System.out.println("Array sorted");

        System.out.println(findNumber(random ,100));
        print(random);
    }

}
