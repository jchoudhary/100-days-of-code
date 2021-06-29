package com.ds.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */

public class LongestSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int max = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                String sub = s.substring(0, i);
                int l = sub.length();

                int index = map.get(c);
                s = s.substring(index+1, len);
                len = s.length();
                i = -1;

                if (l > max) {
                    max = l;
                }

                map = new HashMap<>();
            } else {
                map.put(c, i);
            }
        }

        if (max == 0 || max < map.size()) {
            max = map.size();
        }
        System.out.println("Max length without repeating characters: " +max);
    }
}
