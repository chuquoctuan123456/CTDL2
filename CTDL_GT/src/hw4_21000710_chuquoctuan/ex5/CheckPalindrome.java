package hw4_21000710_chuquoctuan.ex5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static boolean checkPalendrome(String string){
        string = handleString(string);
        Stack<Character> stack = new Stack();
        Queue<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            stack.push(temp);
            queue.add(temp);
        }
        for (int i = 0; i < string.length(); i++) {
            if(stack.pop() != queue.poll()){
                return false;
            }
        }
        return true;
    }
    public static String handleString(String string){
        string = string.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        // only take string
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if(temp >= 97 && temp <= 122){
                stringBuilder.append(temp);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input String : ");
        String string = scanner.nextLine();
        System.out.println(checkPalendrome(string));

    }

}
