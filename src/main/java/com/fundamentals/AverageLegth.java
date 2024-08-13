package com.fundamentals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageLegth {
    public static void findLessAverage (String [] array){
        int [] arrayOfLength = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOfLength[i] = numberLength(array[i]);
        }
        int averageLength = average(arrayOfLength);
        for (int i = 0; i < array.length; i++) {
            {
                if (arrayOfLength[i] < averageLength) {
                    System.out.print("\nNumber " + array[i] + " has length " + arrayOfLength[i] + " less than average ");
                }
            }

        }

    }

    public static void findMoreAverage (String [] array){
        int [] arrayOfLength = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOfLength[i] = numberLength(array[i]);
        }
        int averageLength = average(arrayOfLength);
        for (int i = 0; i < array.length; i++) {
            {
                if (arrayOfLength[i] >= averageLength) {
                    System.out.print("\nNumber " + array[i] + " has length " + arrayOfLength[i] + " more than average ");
                }
            }

        }

    }
    public static int numberLength (String elem) {
        char [] array = elem.toCharArray();
        System.out.println("length = " + array.length);
        return array.length;
    }

    private static int average (int [] array) {
        int lengthSum = 0;
        for (int j : array) {
            lengthSum = lengthSum + j;
        }
        double m = (double) lengthSum/array.length;
        BigDecimal n = new BigDecimal(m).setScale(1, RoundingMode.HALF_UP);
        System.out.println("Average length = " + n);
        return n.setScale(0,RoundingMode.CEILING).intValue();
    }
}
