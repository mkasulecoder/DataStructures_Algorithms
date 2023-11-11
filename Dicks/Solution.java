package Dicks;

public class Solution {
    public static int solution(int[] A) {
        int N = A.length;
        boolean[] seen = new boolean[N + 1]; // Create a boolean array to mark seen numbers

        // Mark numbers from A as seen
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= N) {
                seen[A[i] - 1] = true;
            }
        }

        // Find the first unseen number
        for (int i = 0; i < N; i++) {
            if (!seen[i]) {
                return i + 1; // Return the smallest unseen positive integer
            }
        }

        // If all positive integers are present, return N + 1
        return N + 1;
    }

    public static void main(String[] args) {
        int[] A = new int[] { 1, 3, 6, 4, 1, 2 };
        System.out.println(solution(A)); // Output should be 5
    }
}
