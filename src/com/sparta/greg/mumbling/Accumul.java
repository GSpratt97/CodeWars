package com.sparta.greg.mumbling;

public class Accumul {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
        // Output "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu"
    }

    public static String accum(String s) {
        // your code
        String newString = "";

        String[] array = s.split("");
        for (int i =0; i<s.length();i++) {
            newString += array[i].toUpperCase();
            if (i > 0) {
                for (int j =0 ; j<i;j++) {
                    newString += array[i].toLowerCase();
                }

            }

            if (i != s.length() -1) {
                newString += "-";

            }
            //System.out.println(array[i]);
        }
        return newString;
    }
}
