package com.pluralsight;

public class AverageOfArray {

        public static double find_average(int[] array) {
            // Check if the array is empty
            if (array.length == 0) {
                return 0;  // Return 0 for empty arrays
            }

            // Sum up the elements in the array
            double sum = 0;
            for (int num : array) {
                sum += num;
            }

            // Return the average
            return sum / array.length;
        }
    }
