package com.fundamentals;

public class LongestNumber {
    public static String findLongest (String [] array){
        int [] arrayOfLength = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOfLength[i] = numberLength(array[i]);
        }
        int max = arrayOfLength[0];
        for (int length:arrayOfLength) {
            if (length > max) max = length;
        }
        int n = 0;
        while (arrayOfLength[n] != max) {
            n = n+1;
        }
        return array[n];

    }
    public static int numberLength (String elem) {
        char [] array = elem.toCharArray();
        return array.length;
    }
}
