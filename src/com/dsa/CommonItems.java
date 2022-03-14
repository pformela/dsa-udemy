package com.dsa;

import java.util.Hashtable;

public class CommonItems {

    public static boolean checkIfContainsCommonItems1(String[] arr1, String[] arr2) {

        for (String itemA : arr1) {
            for (String itemB : arr2) {
                if(itemA.equals(itemB)) return true;
            }
        }

        return false;
    }

    public static boolean checkIfContainsCommonItems2(String[] arr1, String[] arr2) {

        Hashtable<String, Boolean> arr1Object = new Hashtable<>();

        for (String item : arr1)
            arr1Object.put(item, true);

        for (String item : arr2)
            if(arr1Object.get(item)) return true;

        return false;
    }


    public static void main(String[] args) {

    }
}
