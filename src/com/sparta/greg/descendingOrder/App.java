package com.sparta.greg.descendingOrder;

public class App {
    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
    }

    public static int sortDesc(final int num) {
        //Your code
        int sortedNumber = 0;


        for (int i=9; i>=0;i--) {
            int tempNum = num;
            while (tempNum > 0) {
                int digit = tempNum %10;
                if (digit == i) {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tempNum /= 10;
            }
        }
        return sortedNumber;
    }
}
