package com.company;

import java.util.Random;

public class MyArray {

    private final int ARR_DEFAULT_SIZE = 10;
    private int[] arr;
    private int[] sortedArr;

    public MyArray() {
        arr = new int[ARR_DEFAULT_SIZE];
        fillEmptyArr();
        printArr();
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

    private void printArr() {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }


    public void sort() {
        sortedArr = arr.clone();
        Sorting kindOfSort = new Quicksort();
        System.out.println(kindOfSort.getClass().getName());
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
