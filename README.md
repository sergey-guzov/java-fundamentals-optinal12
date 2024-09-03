Optional Task 1

To successfully complete the task, it is enough to complete 2-4 points.

Task. Enter n numbers from the console.

1. Find the shortest and longest number. Output the numbers found and their length.
2. Output the numbers in ascending (descending) order of their length values.
3. Output to the console those numbers whose length is less (greater) than the average length for all numbers, as well as the length.
4. Find the number in which the number of different digits is max. If there are several such numbers, find the first of them.

**The programm has next structure:**

1. Class `App` is used for implementation of simple console menu for interaction with other classes
2. Class `ArraySort` is used for implementation of the String array sort by length, using two methods for ASC ans DESC sort (task 2)
3. Class `AverageLegth` is used for calculating an average length of array elements and finding numbers whose length is less (greater) than the average (task 3)
4. Classes `LongestNumber` and `ShortestNumber` are used for finding the shortest/longest number in the array (task 1)
5. Class `UniqDigits` is used for looking for the number with the biggest value of uniq digits (task 4)
6. Class `UserInput` is used to read user's inputs in console
