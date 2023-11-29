package hw7_21000710_chuquoctuan.ex1.array;

import java.util.Random;

public class TestSearchArray {
    public static void main(String[] args) {
        SearchArray<Integer> searchArray = new SearchArray();
        Integer[] array = createArray();
        print(array);
        System.out.println(searchArray.searchSorted(array ,0));
        System.out.println(searchArray.searchNoSorted(array ,10));
    }
    public static Integer[] createArray(){
        Random random = new Random();
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        return array;
    }
    public static void print(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
