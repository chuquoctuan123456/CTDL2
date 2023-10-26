package hw4_21000710_chuquoctuan.ex1;

import java.util.Scanner;
import java.util.Stack;

public class Question {
    private Stack<Character > stack = new Stack<>();

    public void answerQuestion(String string){
        for ( int i = 0; i < string.length () ; i ++) {
            if( i % 2 == 0) {
                stack.push ( string.charAt(i)) ;
            }
            if( i % 3 == 0) {
                stack.pop () ;
            }
            if(i == string.length() - 1){
                System.out.print("Result : ");
                print(stack);
            }else{
                System.out.print("Number " + (i + 1) + " : ");
                print(stack);
            }

        }
    }
    public void print(Stack<Character> stack){

        for(Character ch : stack){
            System.out.print(ch + " ");
        }
        System.out.println();
    }

}
