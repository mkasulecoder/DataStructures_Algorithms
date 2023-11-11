package RemoveElement;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static ArrayList<Integer> newList;
    private static int otherValues;

    public static int removeElement(int[] nums, int val) {

        newList = new ArrayList<Integer>();

        for (int num : nums) {
            if (num != val) {
                newList.add(num);
            }
        }

        return newList.size();
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeElement(nums, val));

        System.out.println(List.of(newList));
    }

}
