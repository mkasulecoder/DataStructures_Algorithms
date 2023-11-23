package LeetCode.RemoveDuplicates;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static ArrayList<Integer> newList;

    public static int removeDuplicates(int[] nums) {
        newList = new ArrayList<Integer>();

        for (int i = 1; i <= nums.length; i++) {

            // get the first element
            int a = nums[i - 1];

            // if the we are at the last index to avoid Out of Bounds
            // OR check to see if the first element is not already present
            if (i == nums.length || a != nums[i]) {
                newList.add(a);
            }
        }

        return newList.size();

    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 2 };
        System.out.println(removeDuplicates(nums));

        System.out.println(List.of(newList));

    }
}
