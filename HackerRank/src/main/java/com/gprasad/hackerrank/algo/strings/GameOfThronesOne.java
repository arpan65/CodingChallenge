/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.algo.strings;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class GameOfThronesOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        System.out.println(ifAnagramPlaindrom(inputString) ? "YES" : "NO");

    }

    public static boolean ifAnagramPlaindrom(String input) {
        boolean isPalindrom = true;
        int[] charCount = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount[c - 'a']++;
        }
        int charOddOccurence = 0;
        for (int i = 0; i < 26; i++) {
            if (charOddOccurence > 1) {
                isPalindrom = false;
                break;
            }
            if (charCount[i] % 2 == 1) {
                charOddOccurence++;
            }
        }
        return isPalindrom;
    }
}
