package hw7_21000710_chuquoctuan.ex1;

public class SearchArray<T extends Comparable> {
    public boolean searchNoSorted(T[] array ,T key){
        if(array == null){
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i].compareTo(key) == 0){
                return true;
            }
        }
        return false;
    }

    public boolean searchSorted(T[] array , T key){
        if(array == null){
            return false;
        }
        array = sortArray(array);
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(key.compareTo(array[mid]) > 0){
                left = mid + 1;
            }
            if(key.compareTo(array[mid]) < 0){
                right = mid - 1;
            }
            if(key.compareTo(array[mid]) == 0){
                return true;
            }
        }
        return false;

    }
    private T[] sortArray(T[] array){
        if(array == null){
            return null;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j].compareTo(array[j + 1]) > 0){
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
