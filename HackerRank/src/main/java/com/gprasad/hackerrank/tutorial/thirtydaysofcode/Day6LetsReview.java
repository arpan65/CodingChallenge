/*
 Objective
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!
Task
Given a string, , of length that is indexed from to , print its even-indexed and odd-indexed characters as space-separated strings on a single line (see the Sample below for more detail).
Note: is considered to be an even index.
Input Format
The first line contains an integer, (the number of test cases).
Each line of the subsequent lines contain a String, .
Constraints
Output Format
For each String (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.
Sample Input
2
Hacker
Rank
Sample Output
Hce akr
Rn ak
Explanation
Test Case 0:
The even indices are , , and , and the odd indices are , , and . We then print a single line of space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
Test Case 1:
The even indices are and , and the odd indices are and . We then print a single line of space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
 */
package com.gprasad.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Day6LetsReview {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            String inputStr = in.next();
            System.out.println(splitByIndex(inputStr));
        }
       in.close();
    }
    public static String splitByIndex(String str)
    {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                even.append(str.charAt(i));
            }
            else
            {
                odd.append(str.charAt(i));
            }
        }
        return even.toString()+" "+odd.toString();
    }
}
