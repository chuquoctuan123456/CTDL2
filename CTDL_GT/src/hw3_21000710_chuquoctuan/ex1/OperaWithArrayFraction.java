package hw3_21000710_chuquoctuan.ex1;

import java.util.Scanner;

public class OperaWithArrayFraction {
    public Fraction findIndex(Fraction[] fractions ,int k){
        if(k < 0 || k >= fractions.length){
            return null;
        }
        return fractions[k + 1];
    }
    public Fraction sumArray(Fraction[] fractions){
        Fraction fraction = new Fraction(fractions[0].getNumerator() ,fractions[0].getDenominator());
        for (int i = 1; i < fractions.length ; i++) {
            fraction.add(fractions[i]);
        }
        return fraction.normalize(fraction);
    }

    public Fraction minusArray(Fraction[] fractions){
        Fraction fraction = new Fraction(fractions[0].getNumerator() ,fractions[0].getDenominator());
        for (int i = 1; i < fractions.length ; i++) {
            fraction.minus(fractions[i]);
        }
        return fraction.normalize(fraction);
    }

    public Fraction multiArray(Fraction[] fractions){
        Fraction fraction = new Fraction(fractions[0].getNumerator() ,fractions[0].getDenominator());
        for (int i = 1; i < fractions.length ; i++) {
            fraction.multi(fractions[i]);
        }
        return fraction.normalize(fraction);
    }

    public Fraction diviArray(Fraction[] fractions){
        Fraction fraction = new Fraction(fractions[0].getNumerator() ,fractions[0].getDenominator());
        for (int i = 1; i < fractions.length ; i++) {
            fraction.divi(fractions[i]);
        }
        return fraction.normalize(fraction);
    }
    public void compareFraction(Fraction fraction1 ,Fraction fraction2){
        if(fraction2 == null || fraction1 == null){
            return;
        }
        float tempNumerator1 = fraction1.getNumerator() * fraction2.getDenominator();
        float tempNumerator2 = fraction2.getNumerator() * fraction1.getDenominator();

        Fraction newFraction1 = fraction1.normalize(fraction1);
        Fraction newFraction2 =  fraction2.normalize(fraction2);

        if(tempNumerator1 > tempNumerator2){
            System.out.println(newFraction1 + " > " + newFraction2);
        } else if (tempNumerator1 < tempNumerator2) {
            System.out.println(newFraction1 + " < " + newFraction2);
        }else {
            System.out.println(newFraction1 + " = " + newFraction2);
        }
    }
    public void print(Fraction fractions){
        System.out.println(fractions.toString());
    }



}
