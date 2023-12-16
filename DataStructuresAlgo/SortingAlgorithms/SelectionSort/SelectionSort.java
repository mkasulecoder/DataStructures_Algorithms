package DataStructuresAlgo.SortingAlgorithm.SelectionSort;

/**
 * Selection sort is a sorting algorithm in which the given array is divided
 * into two subarrays, the sorted left section, and the unsorted right section.
 * 
 * Initially, the sorted portion is empty and the unsorted part is the entire
 * list. In each iteration, we fetch the minimum element from the unsorted list
 * and push it to the end of the sorted list thus building our sorted array.
 * 
 * https://www.crio.do/blog/top-10-sorting-algorithms/
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = { 18, 14, 99, 10 };
        selectionSort(array);
    }

    public static void selectionSort(int[] array) {

        int arraySize = array.length;
        // left side - sort array
        for (int i = 0; i < arraySize - 1; i++) {
            int min_index = i;
            // right side unsorted array
            for (int j = i + 1; j < arraySize; j++) {
                // incase value at j is less than value at i
                // don't bother swapping values
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
                // swap values
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;
            }
        }

        // print array
        printArray(array);
    }

    public static void printArray(int[] sortedArray) {
        for (int num : sortedArray) {
            System.out.println(num);
        }
    }

}
