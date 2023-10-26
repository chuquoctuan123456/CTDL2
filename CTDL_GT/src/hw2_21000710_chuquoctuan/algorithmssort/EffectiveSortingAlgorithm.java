package hw2_21000710_chuquoctuan.algorithmssort;

public interface EffectiveSortingAlgorithm {
    public void sort(int[] array ,int low ,int high);
    public int getCountSwap();

    public int getCountCompare();

}
