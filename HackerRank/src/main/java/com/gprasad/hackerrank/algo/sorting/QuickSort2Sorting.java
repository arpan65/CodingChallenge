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
public class QuickSort2Sorting {

    static void quickSort(int[] ar) {
        sort(0, ar.length - 1, ar);
        printArray(ar);
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        quickSort(ar);
    }

    private static void sort(int lower, int higher, int[] arr) {

        int i = lower;
        int j = higher;
        int midVal = arr[lower + (higher - lower) / 2];
        while (i <= j) {
            if(arr[i] < midVal)
            {
                System.out.println("");
            }
            while (arr[i] < midVal) {
                System.out.print(arr[i] + " ");
                i++;
            }
            if(arr[j] > midVal)
            {
                System.out.println("");
            }
            while (arr[j] > midVal) {
                System.out.print(arr[j] + " ");
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i < higher) {
            sort(i, higher, arr);
        }
        if (j > lower) {
            sort(lower, j, arr);

        }
    }
}
