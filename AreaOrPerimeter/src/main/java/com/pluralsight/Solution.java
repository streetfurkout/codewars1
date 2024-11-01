package com.pluralsight;

public class Solution {
    /**
     * You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
     * If it is a square, return its area. If it is a rectangle, return its perimeter.
     * 6, 10 --> 32
     * 3, 3 --> 9
     */

    public static int areaOfPerimeter(int l, int w) {
        if (l == w) {
            return l * w; // Area for square
        } else {
            return (l + w) * 2; // Perimeter for rectangle
        }
    }

    public static void main(String[] args) {
        System.out.println(areaOfPerimeter(6, 10)); // Output: 32
        System.out.println(areaOfPerimeter(3, 3));   // Output: 9
    }
}
