package com.ds.array.sorting;

public interface SortAlgo {

    void sort(int[] a, int n);

    default void printOutput(int[] a, long start, long end) {
        System.out.println(this.getClass().getName());
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.print(" Time taken : " + (end - start) + "ms");
    }
}
