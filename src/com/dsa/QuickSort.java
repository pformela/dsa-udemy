package com.dsa;

import java.util.Arrays;

public class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static int partition(int[] arr, int firstIndex, int lastIndex) {
        int pivot = arr[lastIndex];
        int i = firstIndex - 1;

        for(int j = firstIndex; j <= lastIndex - 1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, lastIndex);
        return (i + 1);
    }

    static void quickSort(int[] arr, int firstIndex, int lastIndex) {
        if(firstIndex < lastIndex) {
            int partitioningIndex = partition(arr, firstIndex, lastIndex);
            quickSort(arr, firstIndex, partitioningIndex -1);
            quickSort(arr, partitioningIndex + 1, lastIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2,5,1,2,3,5,1,2,4};
        int[] arr2 = {1,7,4,8,9,2,3,5,10,6};

        quickSort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
     }
}
