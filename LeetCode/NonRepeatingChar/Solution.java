package LeetCode.NonRepeatingChar;

import java.util.*;

/**
 * Given a string s consisting of small English letters, find and return the
 * first instance of a non-repeating character in it. If there is no such
 * character, return '_'.
 * 
 * Example
 * 
 * For s = "abacabad", the output should be
 * solution(s) = 'c'.
 * 
 * There are 2 non-repeating characters in the string: 'c' and 'd'. Return c
 * since it appears in the string first.
 * 
 * For s = "abacabaabacaba", the output should be
 * solution(s) = '_'.
 * 
 * There are no characters in this string that do not repeat.
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [memory limit] 1 GB
 * 
 * [input] string s
 * 
 * A string that contains only lowercase English letters.
 * 
 * Guaranteed constraints:
 * 1 ≤ s.length ≤ 105.
 * 
 * [output] char
 * 
 * The first non-repeating character in s, or '_' if there are no characters
 * that do not repeat.
 * 
 */
public class Solution {
    public static void main(String[] args) {
        String s = "zeberaa";
        // solution(s);
        System.out.println(solution(s));
    }

    public static char solution(String s) {
        char letter = '_';

        // Hashset does not allow duplicates
        HashSet<Character> letters = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (letters.contains(s.charAt(i))) {
                // System.out.println("Found Duplicate: " + s.charAt(i));
                letter = s.charAt(i);
                break;
            }

            // Otherwise add the letter
            letters.add(s.charAt(i));
        }

        return letter;
    }

}
