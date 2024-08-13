package com.fundamentals;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        int userSelection = 0;
        do {
            System.out.println("""
                    What operation do you want to do
                    1.Find the shortest number
                    2.Find the longest number
                    3.Sort array by length ASC
                    4.Sort array by length DESC
                    5.Find numbers with length less than average
                    6.Find numbers with length more than average
                    7.Find number with the biggest number of uniq digits""");
            Scanner sc = new Scanner(System.in);
            userSelection = sc.nextInt();
            if (userSelection <= 0 || userSelection > 7 ) System.out.println("Sorry, there is no option " + userSelection + "\nTry again");
        } while (userSelection <= 0 || userSelection > 7);

        String[] array = UserInput.numbresTable();
        for (String s : array) {
            System.out.print(s + ", ");
        }
        switch (userSelection) {
            case 1 -> {
                String shortestNum = ShortestNum.findShortest(array);
                System.out.println("\nThe shortest number = " + shortestNum + ", length = " + ShortestNum.numberLength(shortestNum));
            }
            case 2 -> {
                String longestNum = LongestNumber.findLongest(array);
                System.out.println("\nThe longest number = " + longestNum + ", length = " + LongestNumber.numberLength(longestNum));
            }
            case 3 -> {
                String[] sortedArray = ArraySort.sortAsc(array);
                System.out.println();
                for (int i = 0; i < sortedArray.length; i++) {
                    System.out.print(array[i] + ", ");
                }
            }
            case 4 -> {
                String[] sortedArrayAsc = ArraySort.sortAsc(array);
                String[] sortedArrayDesc = ArraySort.sortDesc(sortedArrayAsc);
                System.out.println();
                for (int i = 0; i < sortedArrayDesc.length; i++) {
                    System.out.print(array[i] + ", ");
                }
            }
            case 5 -> AverageLegth.findLessAverage(array);

            case 6 -> AverageLegth.findMoreAverage(array);

            case 7 -> System.out.print("\nThe first number with max of uniq =  " + UniqDigits.uniqSymbols(array));
        }
    }
}
