package hw4_21000710_chuquoctuan.practice1;

import java.util.Scanner;
import java.util.Stack;

// Ex15
/*
 * ex: s = "aaabbaaac" thì encodeString(s) = "a3b2a3c1"
 * ex: s = "ab" thì encodeString(s) = "a1b1".
 */
public class EncodeString {
    public static String encode(String string){
        string = string.toLowerCase();

        Stack<Character> stack = new Stack<>();
        char[] array = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        int index = 0;
        while(index < array.length) {
            char temp = array[index];
            for (int j = index; j < array.length; j++) {
                if(temp == array[j]){
                    stack.push(temp);
                    index++;
                }else{
                    break;
                }
            }
            stringBuilder.append(temp);
            stringBuilder.append(stack.size());
            stack.clear();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input String : ");
        String string = scanner.nextLine();
        System.out.println(encode(string));
    }
}
