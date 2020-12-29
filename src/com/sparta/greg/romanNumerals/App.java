package com.sparta.greg.romanNumerals;

public class App {
    public static void main(String[] args) {
        System.out.println(solution(1000));
        System.out.println(solution(3000));
    }

    public static String solution(int n) {
        String result = "";

        while (n != 0) {
            if (n >= 1000) {
                result += "M";
                n -= 1000;
            } else if (n >= 500) {
                if (n < 900) {
                    result += "D";
                    n -= 500;
                } else {
                    result += "CM";
                    n -= 100;
                }
            } else if (n >= )
//            else if () {
//                inverseResult += "";
//                n -= ;
//            }



        }
        return inverseResult;
    }
}
