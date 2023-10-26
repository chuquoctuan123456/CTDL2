package hw4_21000710_chuquoctuan.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalculateValueExpressions {
    public static List<String> suffixes(List<String> list) {
        Stack<String> stack = new Stack<>();
        List<String> result = new ArrayList();

        int index = 0;

        while (index < list.size()) {
            String temp = list.get(index);
            if (checkNumber(temp)) {
                result.add(temp);
                index++;
            } else if (temp.equals("(")) {
                stack.push(temp);
                index++;
            } else if (temp.equals(")")) {
                // repeat until :stack not empty and tail stack "("
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    result.add(stack.pop());
                }
                // remove "(" tail in stack
                stack.pop();
                index++;
            } else {
                while (!stack.isEmpty() && getPrecedence(temp) <= getPrecedence(stack.peek())){
                    result.add(stack.pop());
                }
                stack.push(temp);
                index++;
            }
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop());

        }
        return result;
    }
    public static int getPrecedence(String operator) {
        if (operator.equals("+") || operator.equals("-")) {
            return 1;
        } else if (operator.equals("*") || operator.equals("/")) {
            return 2;
        }
        return 0;
    }



    public static boolean checkNumber(String string){
        char ch = string.charAt(0);
        return Character.isDigit(ch);
    }

    public static List<String> handleString(String string) {
        string = string.replaceAll("\\s", "");
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < string.length()) {
            char s = string.charAt(index);
            if (Character.isDigit(s)) {
                while (true) {
                    char temp = string.charAt(index);
                    if (Character.isDigit(temp)) {
                        stringBuilder.append(temp);
                        index++;
                    } else {
                        list.add(stringBuilder.toString());
                        stringBuilder.setLength(0);
                        break;
                    }
                }
            } else {
                list.add(String.valueOf(s));
                index++;
            }
        }
        return list;
    }
    public static double result(List<String> list){
        Stack<Double> stack = new Stack<>();
        for(String s : list) {
            if (checkNumber(s)) {
                Double temp = Double.parseDouble(s);
                stack.push(temp);
            } else {
                double number1 = stack.pop();
                double number2 = stack.pop();
                double result;
                if (s.equals("+")) {
                    result = number1 + number2;
                    stack.push(result);
                } else if (s.equals("-")) {
                    result = number1 - number2;
                    stack.push(result);
                } else if (s.equals("*")) {
                    result = number1 * number2;
                    stack.push(result);
                } else if (s.equals("/")) {
                    result = number1 / number2;
                    stack.push(result);
                }
            }
        }
        return stack.peek();
    }

    public static void print(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        List<String> handleString = handleString("(1 + ((2 + 3) * (8 * 5)))");
        List<String> suffixes = suffixes((handleString));
        double result = result(suffixes);
        System.out.println(result);

        List<String> handleString1 = handleString("(50 - (8 - 4) * (2 + 3)) + (8 / 4 )");
        List<String> suffixes1 = suffixes((handleString1));
        double result1 = result(suffixes1);
        System.out.println(result1);

        List<String> handleString2 = handleString("4 * ((1 + 6) - 2 * ((3 - 9) * (1 + 4)))");
        List<String> suffixes2 = suffixes((handleString2));
        double result2 = result(suffixes2);
        System.out.println(result2);

    }

}
