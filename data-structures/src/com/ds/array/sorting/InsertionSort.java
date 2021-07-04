package com.ds.array.sorting;

/**
 * Insertion Sort steps:
 *  Iterate through the array from start to end
 *  If two adjacent elements are not in sort order, find the correct insertion point for the lower element
 *
 *  Major benefit: Data can be sorted as it is received.
 *   The entire input set does not have to be present before sorting.
 *
 *  Time Complexity:
 *   Best - O(n) [When array is already sorted]
 *   Average and Worst - O(n^2)
 *
 *   Side Note - Performs roughly 7 times better than bubble sort for an array of 10000 elements.
 */
public class InsertionSort implements SortAlgo {

    @Override
    public void sort(int[] a, int n) {
        long start = System.currentTimeMillis();

        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i;

            while (j > 0 && temp < a[j-1]) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }
        long end = System.currentTimeMillis();

        printOutput(a, start, end);
        }
}
