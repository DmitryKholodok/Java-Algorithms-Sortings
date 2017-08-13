package com.company;

import java.util.Random;

public class MyArray {

    private final int ARR_DEFAULT_SIZE = 10;
    private int[] arr;
    private int[] sortedArr;

    public MyArray() {
        arr = new int[ARR_DEFAULT_SIZE];
        fillEmptyArr();
    }

    public MyArray(int[] arr) {
        this.arr = arr;
    }

    private void fillEmptyArr() {
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }


    public void sort() {
        sortedArr = arr.clone();
        Sorting kindOfSort = new InsertionSort();
        kindOfSort.toSort(sortedArr);
    }

    public int[] getArray() {
        return arr;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i : sortedArr)
            str = str + String.valueOf(i) + " ";
        return str;
    }
}
