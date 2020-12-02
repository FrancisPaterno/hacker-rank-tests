package com.francis.programming.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    // Complete the extraLongFactorials function below.
    static BigInteger extraLongFactorials(int n) {
    	BigInteger N = BigInteger.valueOf(n);
    	BigInteger one = BigInteger.ONE;
 
    	if(n == 1) return  one;
    	
    	return N.multiply(extraLongFactorials(n-1));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(extraLongFactorials(n));

        scanner.close();
    }
}
