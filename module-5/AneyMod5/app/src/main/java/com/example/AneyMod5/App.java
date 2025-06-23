/*
Jonah Aney June 22nd, 2025 CSD-402 Module 5: Methods

Write methods using the following headers that returns the location of the largest element in the array passed to the method returning a one-dimensional array that contains two location elements.

    public static int [ ] locateLargest (double [ ][ ] arrayParam)
    public static int [ ] locateLargest (int [ ][ ] arrayParam)

Then, write methods using the following headers that returns the location of the smallest element in the array passed to the method returning a one-dimensional array that contains two location elements.

    public static int [ ] locateSmallest (double [ ][ ] arrayParam)
    public static int [ ] locateSmallest (int [ ][ ] arrayParam) 
 */
package com.example.AneyMod5;

/* 
The App class contains static methods to locate the largest and smallest elements in two-dimensional arrays of doubles and ints. 
It demonstrates their use in the main method.
 */

public class App {

// Main method to test the locateLargest and locateSmallest methods. //

    public static void main(String[] args) {
        double[][] testDoubles = {
            {1.2, 3.4, 5.6},
            {7.8, 9.0, 2.3}
        };
        int[][] testInts = {
            {1, 3, 5},
            {7, 9, 2}
        };

        int[] largestDouble = locateLargest(testDoubles);
        System.out.println("Largest double at: [" + largestDouble[0] + "][" + largestDouble[1] + "]");

        int[] smallestDouble = locateSmallest(testDoubles);
        System.out.println("Smallest double at: [" + smallestDouble[0] + "][" + smallestDouble[1] + "]");

        int[] largestInt = locateLargest(testInts);
        System.out.println("Largest int at: [" + largestInt[0] + "][" + largestInt[1] + "]");

        int[] smallestInt = locateSmallest(testInts);
        System.out.println("Smallest int at: [" + smallestInt[0] + "][" + smallestInt[1] + "]");
    }

// Methods to locate the largest and smallest elements in 2D arrays of doubles and ints //

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

/*
Finds the location of the smallest element in a 2D double array.
@param arrayParam The 2D double array to search
@return An int array of size 2: [row, column] of the smallest element
*/

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

/*
Finds the location of the smallest element in a 2D int array.
@param arrayParam The 2D int array to search
@return An int array of size 2: [row, column] of the smallest element
*/

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}