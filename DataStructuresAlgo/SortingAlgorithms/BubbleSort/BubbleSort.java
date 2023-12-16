package DataStructuresAlgo.SortingAlgorithm.BubbleSort;

/**
 * The basic idea of bubble sorting is that it repeatedly 
 * swaps adjacent elements if they are not in the desired order. 
 * YES, it is as simple as that.
 */

import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = { 8, 4, 9, 10 };

        bubbleSort(array);

    }

    /**
     * Sort the array
     * 
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int arrLength = arr.length;

        // best case = O(n*log(n))
        // average = O(n*log(n))
        // worst case = O(n^2)

        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the result
        printArray(arr);

        // Get space complexity
        System.out.println("Space complexity: " + spaceComplexity(arrLength));

    }

    /**
     * Print the array
     * 
     * @param A
     */
    public static void printArray(int[] A) {
        for (int num : A) {
            System.out.println(num);
        }
    }

    /**
     * Get Space complexity of array
     * 
     * @param arraySize
     * @return
     */
    public static double spaceComplexity(int arraySize) {

        // spaceComplexity = n*log(n)
        return arraySize * (Math.log10(arraySize));
    }

}
