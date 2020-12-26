package com.sparta.greg.squareArea;

public class App {
    public static void main(String[] args) {
        System.out.println(squareArea(2.0));
    }

    public static double squareArea(double A){
        //your code;
        // Get circumference
        double circumference = A * 4;

        // Get radius
        double radius =  circumference / (2 * Math.PI);
        // Get square area
        double area = radius*radius;

        // Round to 2dp & return
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }
}
