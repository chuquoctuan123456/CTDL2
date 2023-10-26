package hw3_21000710_chuquoctuan.ex1;

import java.util.Scanner;

public class TestEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction[] fractions = input(sc);
        OperaWithArrayFraction opera = new OperaWithArrayFraction();

        System.out.print("+ ");
        opera.print(opera.sumArray(fractions));

        System.out.print("- :");
        opera.print(opera.minusArray(fractions));

        System.out.print("x :");
        opera.print(opera.multiArray(fractions));

        System.out.print("/ :");
        opera.print(opera.diviArray(fractions));

        opera.compareFraction(fractions[0] ,fractions[1]);

    }
    public static Fraction[] input(Scanner sc){
        System.out.println("Input length array : ");
        int number = sc.nextInt();
        Fraction[] array = new Fraction[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Input fraction " + (i + 1));
            float numerator = sc.nextFloat();
            float denominator = sc.nextFloat();
            if(denominator == 0){
                System.out.println("Again input");
                denominator = sc.nextFloat();
            }
            array[i] = new Fraction(numerator ,denominator);
        }
        return array;
    }

}
