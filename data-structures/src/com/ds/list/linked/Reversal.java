package com.ds.list.linked;

import java.util.Scanner;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Input format -
 * 1 2 3 4 5
 *
 * Output format
 * 5 4 3 2 1
 */
public class Reversal {

    public static void main(String[] args) {
        //Getting input
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().replace(" ", "");

        char[] a = s1.toCharArray();

        ListNode l1 = new ListNode(Character.getNumericValue(a[0]));

        ListNode current1 = l1;
        for (int i = 1; i < a.length; i++) {
            current1.next = new ListNode(Character.getNumericValue(a[i]));
            current1 = current1.next;
        }
        sc.close();

        //Calling reverse method
        ListNode l2 = reverseList(l1);

        ListNode current2 = l2;
        while (current2 != null) {
            System.out.print(current2.val + " ");
            current2 = current2.next;
        }
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode reversed = head;
        ListNode remaining = head.next;
        reversed.next = null;
        while (remaining != null) {
            ListNode temp = remaining;
            remaining = remaining.next;
            temp.next = reversed;
            reversed = temp;
        }
        return reversed;
    }
}
