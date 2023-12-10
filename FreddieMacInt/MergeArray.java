package FreddieMacInt;

import java.util.*;

public class MergeArray {

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(2, 4, 99));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(9, 34, 7));
        int[] array1 = { 2, 4, 99 };
        int[] array2 = { 45, 66, 23, 0, 12 };

        // for loops
        System.out.println("List: " + mergeArray(nums1, nums2));

        // Arrays.copyOf(src, newLength)
        System.out.println("Sorted List: " + mergeArrayConvieniently(array1, array2));
    }

    public static ArrayList<Integer> mergeArray(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // using loops to merge
        // for (int num : nums1) {
        // nums2.add(num);
        // }
        // using merge
        nums2.addAll(nums1);

        nums2.sort(Comparator.naturalOrder());

        System.out.println(medianValue(nums2));

        return nums2;

    }

    public static String mergeArrayConvieniently(int[] array1, int[] array2) {

        int[] mergeArray = new int[array1.length + array2.length];

        // merge first array
        mergeArray = Arrays.copyOf(array1, array1.length);
        mergeArray = Arrays.copyOf(array2, array2.length);

        System.out.println("Bubble sort: " + bubbleSorter(mergeArray));
        ;

        // sort the array
        Arrays.sort(mergeArray);

        // for (int num : mergeArray) {
        // System.out.println("Value after sort Num: " + num);
        // }
        return Arrays.toString(mergeArray);
    }

    public static String bubbleSorter(int[] array) {

        // {2,4,5,6)
        /**
         * Using array.length - 1 in the first loop is a common
         * practice to optimize the algorithm by avoiding unnecessary
         * comparisons in the last pass. This is because, after the last
         * pass, the largest element is already in its correct position,
         * and there is no need to compare it with the next element in
         * subsequent passes.
         */
        for (int i = 0; i < array.length; i++) {
            /**
             * So, n - 1 - i represents the index of the last unsorted element in the
             * current pass of the outer loop. The - i part is because, after each pass of
             * the outer loop, the largest unsorted element is guaranteed to be at the end
             * of the array, so we don't need to consider it in subsequent passes.
             */
            for (int j = 0; j < array.length - 1 - i; j++) {
                // swap big values
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // for (int num : array) {
        // System.out.print(num + ",");
        // }
        // System.out.println();

        return Arrays.toString(array);

    }

    public static double medianValue(ArrayList<Integer> mergedArray) {
        int middleIndex = 0;
        double middleValue = 0.0;

        for (int i = 0; i < mergedArray.size(); i++) {
            // if length is not even
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