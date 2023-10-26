package hw2_21000710_chuquoctuan.ex7;

import java.util.Random;
import java.util.Scanner;

public class CountCouple {

    public static int countCouples(int[] array ,int sum){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if(sum == (array[i] + array[j])){
                    count++;
                }
            }
        }
        return count;
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
        int[] random = {1 ,2 ,5 ,4 ,3 ,4 ,5 ,3};
        System.out.println("Array random");
        print(random);

        System.out.println(countCouples(random ,6));

    }
}
