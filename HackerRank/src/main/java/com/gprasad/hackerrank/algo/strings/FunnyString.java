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
public class FunnyString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfTestCase = input.nextInt();
        for(int i = 0 ; i < noOfTestCase ; i++)
        {
            String msg = "Funny";
            String strToCheck = input.next();
            for(int j = 1; j<strToCheck.length();j++)
            {
                int actI = strToCheck.charAt(j);
                int actImin1 = strToCheck.charAt(j-1);
                int revI = strToCheck.charAt((strToCheck.length()-1)-j);
                int revImin1 = strToCheck.charAt((strToCheck.length()-j));
                int actVal = actI-actImin1;
                int revVal = revI-revImin1;
                if(Math.abs(actVal)!=Math.abs(revVal))
                {
                    msg="Not Funny";
                    break;
                }
            }
            System.out.println(msg);
        }
    }
}
