package hw5_21000710_chuquoctuan.ex1;

import java.util.Arrays;

public class ArrayBinaryTree<E, T> implements BinaryTreeInterface<T> {
    private E[] array;
    private int n = 0;
    private int defaultsize = 100;

    public ArrayBinaryTree() {
        array = (E[]) new Object[defaultsize];
    }

    @Override
    public T root() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[1];
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int numChildren(T p) {
        int count = 0;
        if (left(p) != null) {
            count++;
        }
        if (right(p) != null) {
            count++;
        }
        return count;
    }

    @Override
    public T parent(T p) {
        int index = (int) p;
        if(index > array.length || index == 0){
            return null;
        }
        return (T) array[index % 2];
    }

    @Override
    public T left(T p) {
        int index = (int) p;
        if(index <= array.length && 2 * index <= array.length ){
            return (T) array[2 * index];
        }
        return null;

    }

    @Override
    public T right(T p) {
        int index = (int) p;
        if(index <= array.length && 2 * index + 1 <= array.length ){
            return (T) array[2 * index + 1];
        }
        return null;
    }

    @Override
    public T sibling(T p) {
        int index = (int) p;
        if(index >= array.length || index == 0){
            return null;
        }

         if (index % 2 == 0) {
            return (T) array[index + 1];
        }
        return (T) array[index - 1];
    }

    // update methods
    public void setRoot(E element) {
        // Set element to root of an empty tree (at index 1)
        array[1] = element;
        n = 1;
    }

    public void setLeft(int p, E element) {
        // Set left child of p (at index 2p)

        if(array.length <= 2 * p){
            E[] arrayCopy = Arrays.copyOf(array, array.length * 2);
            array = arrayCopy;
        }
        array[2 * p] = element;
        n++;
    }

    public void setRight(int p, E element) {
        // Set right child of p (at index 2p+1)
        if(array.length <= 2 * p + 1){
            E[] arrayCopy = Arrays.copyOf(array, array.length * 2 + 1);
            array = arrayCopy;
        }
        array[2 * p + 1] = element;
        n++;
    }
    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
