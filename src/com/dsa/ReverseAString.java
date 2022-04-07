package com.dsa;

public class ReverseAString {

    public static StringBuilder reverse(String str) {
        StringBuilder result = new StringBuilder("");
        int strLength = str.length();

        for(int i = strLength - 1; i >= 0; i--)
            result.append(str.charAt(i));

        return result;
    }

    public static void main(String[] args) {
        String str = "elo";

        System.out.println(str);
        System.out.println(reverse(str));
    }

}
