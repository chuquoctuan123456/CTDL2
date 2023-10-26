package hw1_21000710_ChuQuocTuan;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputAndOutput(sc);
    }
    public static void inputAndOutput(Scanner sc){
        System.out.println("Input Type Byte : ");
        byte type_Byte = sc.nextByte();
        System.out.println("Type Byte : " + type_Byte);

        System.out.println("Input Type Short : ");
        short type_Short = sc.nextShort();
        System.out.println("Type Short : " + type_Short);

        System.out.println("Input Type Int : ");
        int type_Int = sc.nextInt();
        System.out.println("Type Int : " + type_Int);

        System.out.println("Input Type Long : ");
        long type_Long = sc.nextLong();
        System.out.println("Type Long : " + type_Long);

        System.out.println("Input Type Float : ");
        float type_Float = sc.nextFloat();
        System.out.println("Type Float : " + type_Float);

        System.out.println("Input Type Double : ");
        double type_Double = sc.nextDouble();
        System.out.println("Type Double : " + type_Double);

        System.out.println("Input Type Char : ");
        char type_char = sc.next().charAt(0);
        System.out.println("Type Char : " + type_char);

        System.out.println("Input Type Boolean : ");
        boolean type_Boolean = sc.nextBoolean();
        System.out.println("Type Boolean : " + type_Boolean);

        System.out.println("Input Type String : ");
        String type_String = sc.next();
        System.out.println("Type String : " + type_String);

    }
}
