package com.company;

public class BubbleSort extends Sorting {

    @Override
    public int[] toSort(int[] arr) {
        int temp;
        boolean exit = false;
        for(int i = 0; i < arr.length & !exit; i++) {
            exit = true;
            for(int j = 1; j < arr.length - i; j++)
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    exit = false;
                }
        }
        return arr;
    }
}
