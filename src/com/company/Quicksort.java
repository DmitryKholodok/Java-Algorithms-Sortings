package com.company;

import java.util.Comparator;
import java.util.Random;

public class Quicksort extends Sorting {

    private int[] arr;
    private static final Random RND = new Random();

    private final Comparator<Integer> cmp = new Comparator<Integer>() {
        @Override
        public int compare(Integer t0, Integer t1) {
            if (t0 == t1) return 0;
            if (t0 > t1) return 1;
            return -1;
        }
    };

    @Override
    public int[] toSort(int[] arr) {
        this.arr = arr;
        quickSort(0, arr.length - 1);
        return arr;
    }

    private int partition(int begin, int end) {

        int index = begin + RND.nextInt(end - begin + 1);
        int pivot = arr[index];
        swap(index, end);

        for(int i = index = begin; i < end; i++) {
            if (cmp.compare(arr[i], pivot) <= 0) swap(index++, i);
        }

        swap(index, end);

        return index;
    }

    private void quickSort(int begin, int end) {

        if (end > begin) {

            int index = partition(begin, end);
            quickSort(begin, index - 1);
            quickSort(index + 1, end);

        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
