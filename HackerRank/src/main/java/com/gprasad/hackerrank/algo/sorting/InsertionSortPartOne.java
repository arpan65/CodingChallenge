/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.algo.sorting;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class InsertionSortPartOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[] arrInput = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arrInput[i] = input.nextInt();
        }
        insertionSorting(arrInput);
    }

    private static void insertionSorting(int[] ar) {
        int no = ar[ar.length - 1];
        for (int i= ar.length - 2; i >=0 && no<ar[i]; i--) {
            ar[i+1] =ar[i];
            printArray(ar);
            ar[i]=no;
        }
        printArray(ar);
        
    }
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
