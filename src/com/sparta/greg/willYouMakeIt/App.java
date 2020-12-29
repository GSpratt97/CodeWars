package com.sparta.greg.willYouMakeIt;

public class App {
    public static void main(String[] args) {
        System.out.println(zeroFuel(50, 25, 2));
        System.out.println(zeroFuel(100, 50, 1));
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        if (distanceToPump <= mpg * fuelLeft) {
            return true;
        } else {
            return false;
        }
    }
}
