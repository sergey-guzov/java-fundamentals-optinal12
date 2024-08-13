package com.fundamentals;

public class ArraySort {
    public static String[] sortAsc(String[] array) {
        Integer[] numberLength = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            numberLength[i] = array[i].toCharArray().length;
            System.out.print("\nLength for " + array[i] + " = " + numberLength[i]);
        }
        for (int i = 1; i < numberLength.length; i++) {
            for (int j = 0; j < numberLength.length - i; j++) {
                if (numberLength[j] > numberLength[j + 1]) {
                    int temp = numberLength[j];
                    numberLength[j] = numberLength[j + 1];
                    numberLength[j + 1] = temp;
                    String tempString = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempString;
                }
            }
        }
        return array;

    }

    public static String[] sortDesc (String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}

