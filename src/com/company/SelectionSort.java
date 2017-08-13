package com.company;

public class SelectionSort extends Sorting{

    @Override
    public int[] toSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int indexMin = findMin(arr, i);

            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
        return arr;
    }

    private static int findMin(int[] arr, int fromIndex) {

        int indexMin = fromIndex;
        int min = arr[indexMin];

        for(int i = fromIndex + 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

}
