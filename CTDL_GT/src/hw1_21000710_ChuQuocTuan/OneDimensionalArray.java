package hw1_21000710_ChuQuocTuan;

import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] array = input(sc ,number);
        printArray(array);

        System.out.println("Is Prime");
        for(int i = 0 ;i < array.length ;i++){
            if(checkIsPrime(array[i])){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Is Divisible 4 :");
        for(int i = 0 ;i < array.length ;i++){
            if(checkNumberDivisible(array[i])){
                System.out.print(array[i] + " ");
            }
        }


    }
    public static int[] input(Scanner sc ,int number){
        int[] array = new int[number];
        for(int i = 0 ;i < number ;i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static boolean checkIsPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2 ;i < number / 2 ;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }


    public static boolean checkNumberDivisible(int number){
        if(number % 4 == 0){
            return true;
        }
        return false;
    }

    public static void printArray(int[] array){
        for(int i = 0 ;i < array.length ;i++){
            System.out.println((array[i]) + " ");
        }
    }


}
