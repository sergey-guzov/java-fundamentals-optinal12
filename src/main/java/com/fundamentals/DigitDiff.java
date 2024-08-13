package com.fundamentals;

public class DigitDiff {

    public static String minDiffnumber (String[] array ) {
        Integer [] numberOfDiffsymbols = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            numberOfDiffsymbols[i] = calculateNumberOfUniqSymbols(array[i]);
            System.out.println("Number of uniq symbols for " + i + " = " + numberOfDiffsymbols[i] );
        }
        int max = numberOfDiffsymbols[0];
        for (Integer numberOfDiffsymbol : numberOfDiffsymbols) {
            if (numberOfDiffsymbol > max) max = numberOfDiffsymbol;
        }
        System.out.println("Max number of uniq = " +  max);
        int n = 0;
        while (numberOfDiffsymbols[n]!=max) {
            n= n+1;
        }
        System.out.println("The first number with max of uniq =  " + array[n]);
        return array[n];

    }

    private static int calculateNumberOfUniqSymbols (String element) {
        char [] symbolsArray = element.toCharArray();
        for (int i = 0; i < symbolsArray.length; i++) {
            if (symbolsArray[i] == '!') {
                continue;
            }
            for (int j = i+1; j < symbolsArray.length ; j++) {
                if (symbolsArray[i] == symbolsArray[j]){        //second condition can be added to ignore "-"
                    symbolsArray[j] = '!';
                }
            }
        }
        int number = 0;
        for (char c : symbolsArray) {
            if (c != '!') number = number + 1;
        }
        return number;
    }
}

