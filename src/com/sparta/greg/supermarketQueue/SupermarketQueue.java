package com.sparta.greg.supermarketQueue;
import java.util.Arrays;

public class SupermarketQueue {
    public static void main(String[] args) {
//        int[] array = {2, 2, 3, 3, 4, 4}; // n=2
//        int[] array = {6,7,7,1,6,5,4,4,2,7,2,1}; // n=2 expects 12
        int[] array = {1,3,4,6,6,2,3,2,6,3}; //sum= 36 n=4 expects 12
        // 1,3,4,6
        // 6,2,3,5
        // 5,1,2,4
        // 4,2,1,3
        // 3,1,3,2
        // 2,2,2,1
        // 1,1,1,6
        // 3,-,-,5
        // 2,-,-,4
        // 1,-,-,3
        // -,-,-,2
        // -,-,-,1

        System.out.println(solveSuperMarketQueue(array, 4));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int sum = 0;
        int[] nCustomers;
        int[] restOfCustomers;
        // i=0, customers[1,3,4,6]
        if (customers.length == 0) {
            return 0;
        } else if (customers.length == 1) {
            return customers[0];
        } else {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                sum = sumOfArray(customers);
            } else if (customers.length <= n) {
                int customerMax = customers[0];
                for (int i = 0; i < n; i++) {
                    if (customers[i] > customerMax) {
                        customerMax = customers[i];
                    }
                }
                return customerMax;
            } else {
                nCustomers = Arrays.copyOfRange(customers, 0, n);
                restOfCustomers = Arrays.copyOfRange(customers, n, customers.length);
//                restOfCustomers = Arrays.copyOfRange();

                int serviceTime = 0;
                while (sumOfArray(nCustomers) > 0) {
                    for (int i = 0; i < nCustomers.length; i++) {
                        nCustomers[i] -= 1;

                        if (nCustomers[i] == 0 && restOfCustomers.length != 0)  {
                            nCustomers[i] = restOfCustomers[0];
                            restOfCustomers = Arrays.copyOfRange(restOfCustomers, 1, restOfCustomers.length);
                        }
                    }
                    serviceTime += 1;

                }
                return serviceTime;


            }


        }
        return sum;
    }

    public static int sumOfArray(int ary[]) {
        int s = 0;
        for (int i = 0; i < ary.length; i++) {
            s += ary[i];
        }
        return s;
    }
}
