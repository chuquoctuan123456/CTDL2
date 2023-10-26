package hw2_21000710_chuquoctuan.algorithmssort;

import java.util.Random;
import java.util.Scanner;

public class MergeSort implements EffectiveSortingAlgorithm{
    private int countCompare = 0;
    private int countSwap = 0;
    public void sort(int[] array ,int low ,int high){
        if(low < high){
            int mid = (low + high) / 2;
            sort(array ,low ,mid);
            sort(array ,mid + 1 ,high);
            merge(array ,low ,mid ,high);
        }
    }
    private void merge(int[] array,int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = array[low + i];
        for (int j = 0; j < n2; j++)
            right[j] = array[mid + 1 + j];

        int i = 0, j = 0;

        int k = low;
        while (i < n1 && j < n2) {
            countCompare++;
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            countCompare++;
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            countCompare++;
            array[k] = right[j];
            j++;
            k++;
        }
    }


    @Override
    public int getCountCompare() {
        return countCompare;
    }

    @Override
    public int getCountSwap() {
        return countSwap;
    }
}
