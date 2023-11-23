package LeetCode.SecondDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] a = { 2, 1, 3, 5, 3, 2 };
        System.out.println(solution(a));
    }

    public static int solution(int[] a) {
        // Use a HashSet to keep track of seen elements
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            int current = a[i];

            // If the element is already in the set, return it as it is the first duplicate
            if (seen.contains(current)) {
                return current;
            }

            // Otherwise, add the element to the set
            seen.add(current);
        }

        // If no duplicates are found, return -1
        return -1;
    }
}
