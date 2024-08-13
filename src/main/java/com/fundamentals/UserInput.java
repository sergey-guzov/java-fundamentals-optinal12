package com.fundamentals;

import java.util.Scanner;

public class UserInput {

    public static String[] numbresTable () {
        Scanner sc = new Scanner(System.in);
        Integer n;
        do {
            System.out.println("How many numbers do you want to enter");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Sorry, quantity cannot be " + n + "\nTry again!");
            }
        } while (n <= 0);
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            Integer c = sc.nextInt();        // Math.abs can be added here to ignore "-"
            array[i] = c.toString();
        }
        sc.close();
        return array;
    }
}
