package hw4_21000710_chuquoctuan.ex1;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question = new Question();
        String string = input(sc);
        question.answerQuestion(string);
    }

    public static String input(Scanner scanner){
        System.out.print("Input name : ");
        String name = scanner.nextLine();
        return name;
    }
}
