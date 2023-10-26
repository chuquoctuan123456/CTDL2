package hw4_21000710_chuquoctuan.practice3;

import java.util.Scanner;
import java.util.Stack;

public class RemoveElementMiddle {
    public static Stack<Integer> removeMiddle(int[] array) {
        if (array == null || array.length <= 0){
            return null;
        }
        int middle = array.length / 2;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < middle; i++) {
            tempStack.push(stack.pop());
        }
        stack.pop();

       while(!tempStack.isEmpty()){
           stack.push(tempStack.pop());
        }
       return stack;
    }

    public static void print(Stack<Integer> stack) {
        for (Integer s : stack) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = input();

        System.out.println("Before : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        Stack<Integer> stack = removeMiddle(array);
        System.out.println("After : ");
        print(stack);


    }
}
