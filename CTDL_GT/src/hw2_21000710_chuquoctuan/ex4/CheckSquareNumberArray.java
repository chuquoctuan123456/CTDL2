package hw2_21000710_chuquoctuan.ex4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Exercise 50
public class CheckSquareNumberArray {
    private static boolean check(int number){
        if(number < 0){
            return false;
        }
        int temp = (int) Math.sqrt(number);
        return temp * temp == number;
    }
    public static int[] arraySquareNumber(int[] array){
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            boolean checkList = false;
            if (check(array[i])){
                for (int j = 0; j < list.size(); j++) {
                    if(array[i] == list.get(j)){
                        checkList = true;
                        break;
                    }
                }
                if(!checkList){
                    list.add(array[i]);
                }
            }

        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static int[] insertionSort(int[] array) {
        if(array.length == 0){
            return null;
        }
        for (int i = 1; i < array.length ; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
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

        int[] arraySquareNumber = arraySquareNumber(random);
        System.out.println("Array square number");
        print(arraySquareNumber);

        System.out.println("Array square number sorted");
        print(insertionSort(arraySquareNumber));



    }
}
