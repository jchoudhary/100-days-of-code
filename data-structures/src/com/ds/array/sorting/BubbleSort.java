package com.ds.array.sorting;

import java.util.Scanner;

/**
 * Bubble sort steps:
 *  Iterate through the array from start to end
 *  If any two adjacent elements are not in sort order, swap them
 *  Repeat this process until array is sorted (no swaps are performed)
 *
 * Time Complexity:
 *  Best - O(n) [when the array is already sorted]
 *  Average & Worst - O(n^2)
 */
public class BubbleSort implements SortAlgo {

    @Override
    public void sort(int[] a, int n) {
        long start = System.currentTimeMillis();
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < n-1; i++) {
                if (a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swap = true;
                }
            }
        } while (swap);

        long end = System.currentTimeMillis();

        printOutput(a, start, end);
    }
}
