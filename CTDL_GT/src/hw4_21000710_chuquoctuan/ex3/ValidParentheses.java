package hw4_21000710_chuquoctuan.ex3;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean validParenthese(String expression) {
        expression = expression.replaceAll(" ", "");

        Stack<Character> stack = new Stack();
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{'){
                stack.push(expression.charAt(i));
            }
            if(expression.charAt(i) == ')' || expression.charAt(i) == ']' || expression.charAt(i) == '}'){
               if(stack.empty()){
                   return false;
               }
               char temp = stack.pop();
               if(!checkBracketsMatch(temp ,expression.charAt(i))){
                   return false;
               }
            }

        }
        return stack.isEmpty();


    }
    public boolean checkBracketsMatch(char open ,char close){
        if(open == '(' && close == ')'){
            return true;
        }
        if(open == '[' && close == ']'){
            return true;
        }
        if(open == '{' && close == '}'){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        ValidParentheses check = new ValidParentheses();
        System.out.println(check.validParenthese("(a − b) ∗ (c + d)"));
        System.out.println(check.validParenthese("(10 + 8)/((5 − 2) ∗ 17)"));

        System.out.println(check.validParenthese("(a + b) ∗ c − d)"));
        System.out.println(check.validParenthese("(10 − 8/((2 + 5) ∗ 17)"));
        System.out.println(check.validParenthese(")u − v) ∗ (m + n)"));

        System.out.println(check.validParenthese(")(()(((}{}}{"));
        System.out.println(check.validParenthese("[]{()}(({[]}))"));

    }


}
