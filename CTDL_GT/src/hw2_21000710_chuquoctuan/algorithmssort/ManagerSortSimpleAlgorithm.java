package hw2_21000710_chuquoctuan.algorithmssort;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManagerSortSimpleAlgorithm {
    private SimpleSortingAlgorithm sortingAlgorithm;
    private EffectiveSortingAlgorithm effectiveSortingAlgorithm;
    private int number;
    private int[] array;
    public ManagerSortSimpleAlgorithm() {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setSortingAlgorithm(SimpleSortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void setEffectiveSortingAlgorithm(EffectiveSortingAlgorithm effectiveSortingAlgorithm) {
        this.effectiveSortingAlgorithm = effectiveSortingAlgorithm;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public SimpleSortingAlgorithm getSortingAlgorithm() {
        return sortingAlgorithm;
    }

    public EffectiveSortingAlgorithm getEffectiveSortingAlgorithm() {
        return effectiveSortingAlgorithm;
    }

    public double averageTimeSimpleSort(){
        long sum = 0;
        for (int i = 0; i < 20; i++) {
            setArray(randomArray(number));
            sum += excutionTimeSimpleSort();
        }
        sum /= 20;
        return Math.round(sum * 100) / 100.0;

    }
    public long excutionTimeSimpleSort(){
        long startTime = System.currentTimeMillis();
        sortingAlgorithm.sortVersion2(array);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        return executionTime;
    }

    public double averageTimeEffective(){
        long sum = 0;
        for (int i = 0; i < 20; i++) {
            setArray(randomArray(number));
            sum += excutionTimeEffectiveSort();
        }
        return Math.round(sum * 100) / (100.0 * 20);

    }
    public long excutionTimeEffectiveSort(){
        long startTime = System.currentTimeMillis();
        effectiveSortingAlgorithm.sort(array ,0 ,array.length - 1);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        return executionTime;
    }
    public void sort(){
        sortingAlgorithm.sort(array);
    }

    public int[] randomArray(int number){
        int[] rand = new int[number];
        Random random = new Random();
        for(int i = 0; i < rand.length ;i++){
            rand[i] = random.nextInt(1000000) + 1;
        }
        return rand;
    }
    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
