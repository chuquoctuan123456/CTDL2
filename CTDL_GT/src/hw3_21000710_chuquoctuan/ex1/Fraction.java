package hw3_21000710_chuquoctuan.ex1;

import java.util.ArrayList;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public Fraction add(Fraction c) {
        this.numerator = this.numerator * c.denominator + this.denominator * c.numerator;
        this.denominator = this.denominator * c.denominator;
        return normalize(this);
    }

    public Fraction minus(Fraction c) {
        this.numerator= numerator * c.denominator - denominator * c.numerator;
        this.denominator = denominator * c.denominator;
        return normalize(this);
    }

    public Fraction multi(Fraction c) {
        this.numerator = numerator * c.numerator;
        this.denominator = denominator * c.denominator;
        return normalize(this);
    }

    public Fraction divi(Fraction c) {
        this.numerator = numerator * c.denominator;
        this.denominator  = denominator * c.numerator;
        return normalize(this);
    }

    public Fraction normalize(Fraction c) {
        float tempNumerator = c.numerator;
        float tempDenominator = c.denominator;
        while(!(tempNumerator % 1 == 0) || !(tempDenominator % 1 == 0)){
            tempNumerator *= 10;
            tempDenominator *= 10;
        }
        int gcd = gcd((int)tempNumerator ,(int)tempDenominator);

        int numeratorNormalize = (int)tempNumerator / gcd;
        int denominatorNormalize = (int)tempDenominator / gcd;
        return new Fraction(numeratorNormalize ,denominatorNormalize);
    }
    private int gcd(int x, int y) {
        if(y == 0){
            return x;
        }
        return gcd(y, x%y);
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        int convertNumerator = (int) numerator;
        int convertdenominator= (int) denominator;

        if(convertdenominator < 0){
            if(numerator > 0){
                stringBuffer.append(-convertNumerator + "/" + -convertdenominator);
            }
        } else if (convertdenominator == 0) {
                stringBuffer.append(0);
        } else{
                stringBuffer.append(convertNumerator + "/" + convertdenominator);
        }
        return stringBuffer.toString();

    }
}
