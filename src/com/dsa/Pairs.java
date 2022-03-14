package com.dsa;

public class Pairs {

    public static void logPairs(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) continue;
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        logPairs(new int[]{1,2,3,4,5});
    }
}
