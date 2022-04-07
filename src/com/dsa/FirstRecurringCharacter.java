package com.dsa;

import java.util.HashMap;

public class FirstRecurringCharacter {

    public static int returnSecondOccurence(int[] arr) {
        int result;
        HashMap<Integer, Boolean> dict = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(dict.get(arr[i]) == null)
                dict.put(arr[i], true);
            else
                return arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,5,1,2,3,5,1,2,4};
        int[] arr2 = {2,1,1,2,3,5,1,2,4};
        int[] arr3 = {2,3,4,5};

        System.out.println(returnSecondOccurence(arr1));
        System.out.println(returnSecondOccurence(arr2));
        System.out.println(returnSecondOccurence(arr3));
    }
}
