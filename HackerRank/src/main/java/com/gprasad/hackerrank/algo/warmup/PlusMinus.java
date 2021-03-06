/*
 

Problem Statement

Given an array of integers, calculate which fraction of the elements are positive, negative, and zeroes, respectively. Print the decimal value of each fraction.

Input Format

The first line, N, is the size of the array.
The second line contains N space-separated integers describing the array of numbers (A1,A2,A3,⋯,AN).

Output Format

Print each value on its own line with the fraction of positive numbers first, negative numbers second, and zeroes third.

Sample Input

6
-4 3 -9 0 4 1         

Sample Output

0.500000
0.333333
0.166667

Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
The fraction of the positive numbers, negative numbers and zeroes are 36=0.500000, 26=0.333333 and 16=0.166667, respectively.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10−4 are acceptable.

 */
package com.gprasad.hackerrank.algo.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[] intArr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            intArr[i] = input.nextInt();
        }
        float posCont = 0f;
        float negCount = 0f;
        float zeroCount = 0f;
        for (Integer num : intArr) {
            if (num > 0) {
                posCont++;
            } else if (num < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }
        float posFact = posCont / arrSize;
        float negFact = negCount / arrSize;
        float zeroFact = zeroCount / arrSize;
        System.out.println(String.format("%.03f", posFact));
        System.out.println(String.format("%.03f", negFact));
        System.out.println(String.format("%.03f", zeroFact));
    }
}
