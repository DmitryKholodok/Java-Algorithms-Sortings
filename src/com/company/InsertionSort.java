package com.company;

public class InsertionSort extends Sorting {
    
    @Override
    public int[] toSort(int[] arr) {
        int temp = 0;
        for(int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i;
            while(j > 0 && temp > arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
