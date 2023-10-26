package hw1_21000710_ChuQuocTuan;

import java.util.ArrayList;
import java.util.List;

public class OneDimensionalArrayGeneric<T extends Comparable<T>> {
    private T[] array;

    public OneDimensionalArrayGeneric(T[] array) {
        this.array = array;
    }

    public T findMax(){
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i].compareTo(max) > 0){
                max = array[i];

            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] typeInt = {1 ,3 ,4 ,8 ,9 ,2 ,3};
        OneDimensionalArrayGeneric<Integer> generic1 = new OneDimensionalArrayGeneric<>(typeInt);
        System.out.println(generic1.findMax());


        Double[] typeDouble = {1.0 ,3.0 ,4.6 ,8.1 ,9.9 ,2.1 ,3.12};
        OneDimensionalArrayGeneric<Double> generic2 = new OneDimensionalArrayGeneric<>(typeDouble);
        System.out.println(generic2.findMax());
    }
}