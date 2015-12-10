/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.algo.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author gq6pras
 */
public class Pangrams {
    public static void main(String[] args) {
        Set<Character> albhabets = new HashSet<>();
        for(char c='a';c<='z';c++)
        {
            albhabets.add(c);
        }
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().toLowerCase();
        for(int i =0;i<sentence.length();i++)
        {
            albhabets.remove(sentence.charAt(i));
        }
        System.out.println(albhabets.isEmpty()?"pangram":"not pangram");
    }
}
