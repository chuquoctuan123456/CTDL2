package hw1_21000710_ChuQuocTuan;

import java.util.Scanner;

public class OperaComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Complex complex1 = inputComplex(sc);
//        Complex complex2 = inputComplex(sc);
//
//        System.out.println(addComplex(complex1 ,complex2));
//        System.out.println(multiplyTwoComplex(complex1 ,complex2));

        int n = sc.nextInt();
        Complex[] arrayComplex = new Complex[n];
        for(int i = 0 ;i < n ;i++){
            arrayComplex[i] = inputComplex(sc);
        }

        System.out.println(sumComplex(arrayComplex));
        System.out.println(multiplyMuchComplex(arrayComplex));


    }
    public static Complex addComplex(Complex complex1 ,Complex complex2){
        double real = complex1.getReal() + complex2.getReal();
        double imag = complex1.getImag() + complex2.getImag();

        Complex complex = new Complex(real ,imag);
        return complex;
    }

    public static Complex sumComplex(Complex[] complexArrays){
        double real = 0;
        double imag = 0;
        for(int i = 0 ;i < complexArrays.length ;i++){
            real += complexArrays[i].getReal();
            imag += complexArrays[i].getImag();
        }
        Complex complex = new Complex(real , imag);
        return complex;
    }

    public static Complex multiplyTwoComplex(Complex complex1 ,Complex complex2){
        double real = complex1.getReal() * complex2.getReal() - complex1.getImag() * complex2.getImag();
        double imag = complex1.getReal() * complex2.getImag() + complex1.getImag() * complex2.getReal();

        Complex complex = new Complex(real , imag);
        return complex;
    }

    public static Complex multiplyMuchComplex(Complex[] complexArrays){
        if(complexArrays.length < 3){
            return multiplyTwoComplex(complexArrays[0] ,complexArrays[1]);
        }
        Complex multiply = null;
        Complex temp = complexArrays[0];
        for(int i = 1 ;i < complexArrays.length ;i++){
            multiply = multiplyTwoComplex(temp , complexArrays[i]);
            temp = multiply;
        }
        return multiply;
    }
    public static Complex inputComplex(Scanner sc) {
        double real = sc.nextDouble();
        double imag = sc.nextDouble();

        return new Complex(real ,imag);
    }
    public static void printComplex(Complex complex){
        System.out.println(complex.toString());
    }
}
