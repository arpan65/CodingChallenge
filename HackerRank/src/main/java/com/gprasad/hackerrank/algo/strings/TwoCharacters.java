/*
 
Two Characters (Hackerrank Java Solution)

String always consists of two distinct alternating characters. For example, if string 's two distinct characters are x and y, then t could be xyxyx or yxyxy but not xxyy or xyyx.

You can convert some string to string by deleting characters from . When you delete a character from , you must delete all occurrences of it in . For example, if abaacdabd and you delete the character a, then the string becomes bcdbd.

Given , convert it to the longest possible string . Then print the length of string on a new line; if no string can be formed from , print instead.

Input Format

The first line contains a single integer denoting the length of .
The second line contains string .

Constraints

    only contains lowercase English alphabetic letters (i.e., a to z).

Output Format

Print a single integer denoting the maximum length of for the given ; if it is not possible to form string , print instead.

Sample Input

10
beabeefeab

Sample Output

5

Explanation

The characters present in are a, b, e, and f. This means that must consist of two of those characters.

If we delete e and f, the resulting string is babab. This is a valid as there are only two distinct characters (a and b), and they are alternating within the string.

If we delete a and f, the resulting string is bebeeeb. This is not a valid string because there are three consecutive e's present.

If we delete only e, the resulting string is babfab. This is not a valid string because it contains three distinct characters.

Thus, we print the length of babab, which is , as our answer.

 */
package com.gprasad.hackerrank.algo.strings;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class TwoCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        
    }
    
}
