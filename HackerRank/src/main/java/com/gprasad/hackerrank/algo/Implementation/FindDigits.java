/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.algo.Implementation;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String n = in.next();
            System.out.println(countOfCount(n));
        }
    }

    private static int countOfCount(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            Integer digit = Character.digit(n.charAt(i), 10);
            try {
                if (Long.parseLong(n) % digit.longValue() == 0) {
                    count++;
                }
            } catch (ArithmeticException ae) {
                continue;
            }
        }
        return count;
    }
}
