package com.fundamentals;

public class ShortestNum {   //return first shortest number

    public static String findShortest (String [] array){
        int [] arrayOfLength = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOfLength[i] = numberLength(array[i]);
        }
        int min = arrayOfLength[0];
        for (int length:arrayOfLength) {
            if (length < min) min = length;
        }
        int n = 0;
        while (arrayOfLength[n] != min) {
            n = n+1;
        }
        return array[n];

    }

    public static int numberLength (String elem) {
        char [] array = elem.toCharArray();
        return array.length;
    }
}
