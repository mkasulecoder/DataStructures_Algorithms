package LeetCode.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Given an integer array nums sorted in non-decreasing order, remove some
 * duplicates in-place such that each unique element appears at most twice. The
 * relative order of the elements should be kept the same.
 * 
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array
 * nums. More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result. It does not
 * matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do not allocate extra space for another array. You must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * 
 */
public class SolutionTwo {
    public static int removeDuplicates(int[] nums) {

        int counter = 0;

        HashSet<Integer> numsSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            int firstNumber = nums[i];
            // check for duplicates
            if (numsSet.contains(firstNumber) && counter != 3) {
                System.out.println(nums[i]);
                counter++;
            }

            numsSet.add(nums[i]);

        }

        return numsSet.size();

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        System.out.println("Value is: " + removeDuplicates(nums));
        ;
    }
}
