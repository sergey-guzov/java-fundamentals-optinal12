package com.fundamentals;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] array = UserInput.numbresTable();
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("The 4th tasks = " + DigitDiff.minDiffnumber(array) );
        /*String[] sortedArray = ArraySort.sortAsc(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print( array[i] + ", " );
        }*/
    }
}
