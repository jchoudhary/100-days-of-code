package com.ds.array.sorting;

import java.util.Scanner;

public class SortingComparison {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = n - i;
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = n - i;
        }

        System.out.println("Input array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();

        SortAlgo bs = new BubbleSort();
        bs.sort(b, n);
        System.out.println();

        SortAlgo is = new InsertionSort();
        is.sort(a, n);
        System.out.println();

    }
}
