package com.dsa;

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length) {
            if(a[i] < b[j])
                result[k++] = a[i++];
            else
                result[k++] = b[j++];
        }

        while(i < a.length)
            result[k++] = a[i++];

        while(j < b.length)
            result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int[] b = {4,6,8,10};

        System.out.println(Arrays.toString(merge(a, b)));
    }
}
