package LeetCode.KeepTwoDuplicates;

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        System.out.println(keepTwoDuplicates(array));
        ;
    }                                          

    public static int keepTwoDuplicates(int[] nums) {
        int count = 0;

        for (int i = 2; i < nums.length; i++) {
            // get the first element
            int a = nums[i - 2];

            if (i == nums.length || a == nums[i]) {
                // remove this element from array since its a duplicate
                // replace it with element a
                nums[i] = nums[i - 3];  
                count++;
                
            }
        }

        return count;
    }

}
