package com.dsa;

import java.util.Arrays;

public class TwoSum {

    public static int[] sumOfTwo(int[] arr, int target) {
        int[] indexes = new int[2];

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwo(new int[]{3,2,3}, 6)));
    }
}
