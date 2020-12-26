package com.sparta.greg.triangleTester;

public class App {
    public static void main(String[] args) {
        System.out.println(isTriangle(7, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c){
        if ((a + b > c) && (a < b + c) && (a + c > b)) {
            return true;
        } else {
            return false;
        }
    }
}
