package hw5_21000710_chuquoctuan.practice1;

import java.util.Scanner;

//55
public class Fibonacci {
    public static int fibonaci(int n){
        if(n <= 0){
            return -1;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number : ");
        int n = sc.nextInt();
        System.out.print("nth number of the fibonaci : ");
        System.out.println(fibonaci(n));
    }
}
