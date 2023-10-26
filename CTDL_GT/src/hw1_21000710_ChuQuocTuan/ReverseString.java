package hw1_21000710_ChuQuocTuan;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String :");
        String s = input(sc);

        System.out.println("Reverse String : " + reverseString(s));

    }
    public static String input(Scanner sc){
        String s = sc.nextLine();
        return s;
    }
    public static String reverseString(String s){
        String reverse = new String();
        for(int i = 0 ;i < s.length() ;i++){
            reverse += s.charAt(s.length() - 1 - i);
        }
        return reverse;
    }
}
