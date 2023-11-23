import java.util.*;

public class MergeArray {

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(2, 4, 99));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(9, 34, 7));
        System.out.println(mergeArray(nums1, nums2));
    }

    public static ArrayList<Integer> mergeArray(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {

        for (int num : nums1) {
            nums2.add(num);
        }
        nums2.sort(Comparator.naturalOrder());

        System.out.println(medianValue(nums2));

        return nums2;

    }

    public static double medianValue(ArrayList<Integer> mergedArray) {
        int middleIndex = 0;
        double middleValue = 0.0;

        for (int i = 0; i < mergedArray.size(); i++) {
            if (mergedArray.size() % 2 != 0) {
                middleIndex = mergedArray.size() / 2;
                middleValue = mergedArray.get(middleIndex);
            } else {
                middleIndex = mergedArray.size() / 2;
                int lastValue = mergedArray.get(middleIndex);
                int prevValue = mergedArray.get(middleIndex - 1);
                // [2, 4, 7, 9, 34, 99] where lastValue = 9 prevValue = 7
                middleValue = (lastValue + prevValue) / 2.0;
            }
        }
        return middleValue;
    }

}