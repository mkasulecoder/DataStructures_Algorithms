package MergeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static List<Integer> merge(List<Integer> nums1, int m, List<Integer> nums2, int n) {

        for (int num : nums2) {
            if (num > 0)
                nums1.add(num);
        }

        for (int num : nums1) {
            if (num == 0)
                nums1.remove(num);
        }

        nums1.sort(Comparator.naturalOrder());

        return nums1;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(2, 5, 6));
        int m = 3;
        int n = 3;
        System.out.println(List.of(merge(nums1, m, nums2, n)));
    }
}
