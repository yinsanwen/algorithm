package me.load.hackerrank;

import java.util.Scanner;

/**
 * Created by yinsanwen on 2017/7/7.
 */
public class AVeryBigSum {

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        long longSum = 0L;
        for (int ar_i = 0; ar_i < n; ar_i++) {
            longSum += ar[ar_i];
        }
        return longSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
