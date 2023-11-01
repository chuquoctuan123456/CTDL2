package hw5_21000710_chuquoctuan.practice1;

import java.util.Scanner;

// 52
public class Factorial {
    public static int factorial(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number : ");

        int n = sc.nextInt();
        System.out.print("Factorial of n : ");
        System.out.println(factorial(n));
    }
}
