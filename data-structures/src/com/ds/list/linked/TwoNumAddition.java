package com.ds.list.linked;

import java.util.Scanner;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list in reverse order.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input format -
 * 2 4 6
 * 3 6 7
 *
 * Output format
 * 5 0 4 1
 *
 */
public class TwoNumAddition {

    public static void main(String[] args) {
        //Getting input
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().replace(" ", "");
        String s2 = sc.nextLine().replace(" ", "");

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        ListNode l1 = new ListNode(Character.getNumericValue(a[0]));
        ListNode l2 = new ListNode(Character.getNumericValue(b[0]));
        ListNode current1 = l1;
        for (int i = 1; i < a.length; i++) {
            current1.next = new ListNode(Character.getNumericValue(a[i]));
            current1 = current1.next;
        }
        ListNode current2 = l2;
        for (int i = 1; i < b.length; i++) {
            current2.next = new ListNode(Character.getNumericValue(b[i]));
            current2 = current2.next;
        }
        sc.close();

        //Calling add method
        Solution sol = new Solution();
        ListNode l3 = sol.addTwoNumbers(l1, l2);

        ListNode current = l3;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current1 = l1.next;
        ListNode current2 = l2.next;

        //Build head of result list
        int sum = l1.val + l2.val;
        int carry = 0;
        if (sum > 9) {
            sum = sum % 10;
            carry = 1;
        }
        ListNode l3 = new ListNode(sum);
        ListNode current3 = l3;

        while(current1 != null || current2 != null) {
            int num1 = 0, num2 = 0;
            if (current1 != null) {
                num1 = current1.val;
                current1 = current1.next;
            }
            if (current2 != null) {
                num2 = current2.val;
                current2 = current2.next;
            }
            sum = num1 + num2;

            if (carry > 0) {
                sum = sum + carry;
                carry = 0;
            }
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            }
            current3.next = new ListNode(sum);
            current3 = current3.next;
        }
        if (carry > 0) {
            current3.next = new ListNode(carry);
        }
        return l3;
    }
}
