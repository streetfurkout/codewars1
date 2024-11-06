package com.pluralsight;

public class Maskify {
    public static String maskify(String str) {

        if (str.length() <= 4) {
            return str;
        }
        StringBuilder maskedPart = new StringBuilder();

        for (int i = 0; i < str.length() -4; i++) {

            maskedPart.append("#");

            maskedPart.append(str.substring(str.length()-4));
        }
        return maskedPart.toString();
    }
}

