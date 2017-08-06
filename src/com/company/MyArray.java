package com.company;

import java.util.Random;

public class MyArray {

    private final int ARR_DEFAULT_SIZE = 7;
    private int[] arr;

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


    public int[] sort() {
        int[] notSortedArr = arr.clone();
        Sorting kindOfSort = new BubbleSort();
        return kindOfSort.toSort(notSortedArr);
    }

    public int[] getArray() {
        return arr;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i : arr)
            str = str + String.valueOf(i) + " ";
        return str;
    }
}
