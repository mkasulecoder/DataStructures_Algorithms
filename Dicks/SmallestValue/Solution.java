package SmallestValue;

import java.util.HashSet;

/**
 * This is a demo task.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 * 
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * 
 * Given A = [1, 2, 3], the function should return 4.
 * 
 * Given A = [−1, −3], the function should return 1.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range
 * [−1,000,000..1,000,000].
 */
public class Solution {

    public static void main(String[] args) {
        int[] A = { 1, 3, 6, 4, 1, 2 };
        int[] B = { 1, 2, 3 };
        int[] C = { -1, -3 };

        int valueOne = solution(A);
        int valueTwo = solution(B);
        int valueThree = solution(C);

        System.out.println("Smallest value is: " + valueOne);
        System.out.println("Smallest value is: " + valueTwo);
        System.out.println("Smallest value is: " + valueThree);
    }

    public static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        int value = 1;

        for (int num = 1; num <= set.size() + 1; num++) {
            if (!set.contains(num)) {
                // if the current index doesn't exist as value in set,
                // return that index immediately
                value = num;
                break;
            }
        }

        return value;
    }

}
