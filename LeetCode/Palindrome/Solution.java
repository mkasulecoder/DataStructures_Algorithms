package LeetCode.Palindrome;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("aaacodedoc"));
    }

    public static String solution(String word) {
        return isPalindrome(word) ? "Not Palindrome" : removePalindrome(word);
    }

    public static boolean isPalindrome(String s) {

        int rightIndex = 0;
        int leftIndex = s.length() - 1;

        while (rightIndex < leftIndex) {
            if (s.charAt(rightIndex) != s.charAt(leftIndex)) {
                return false;
            }
            rightIndex++;
            leftIndex--;
        }

        return true;
    }

    public static String removePalindrome(String s) {

        StringBuilder charString = new StringBuilder();

        if (isPalindrome(s)) {
            for (int i = 0; i < s.length(); i++) {
                charString.append(s.charAt(i));
            }
            return charString.toString();
        } else {
            return s;
        }
    }

}
