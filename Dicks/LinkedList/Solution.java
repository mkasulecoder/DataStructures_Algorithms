package LinkedList;

import java.util.LinkedList;

/**
 * A non-empty array A consisting of N integers is given.
 * 
 * Array A represents a linked list. A list is constructed from this array as
 * follows:
 * 
 * the first node (the head) is located at index 0;
 * the value of a node located at index K is A[K];
 * if the value of a node is −1 then it is the last node of the list;
 * otherwise, the successor of a node located at index K is located at index
 * A[K] (you can assume that A[K] is a valid index, that is 0 ≤ A[K] < N).
 * For example, for array A such that:
 * 
 * A[0] = 1
 * A[1] = 4
 * A[2] = -1
 * A[3] = 3
 * A[4] = 2
 * 
 * Linked List = 1,4,2,-1 // Flip last index's value the -1's index value
 * return the size of the linked list
 */
public class Solution {

    public static void main(String[] args) {
        int[] A = { 4, 2, 1, -1, 3 };
        int[] B = { -1, 0 };
        int[] C = { 3, 5, 9, 7, -1, 4 };
        int[] D = { 1, -1, 0, 0, 0 };
        int linkedListSize = solution(A);

        System.out.println("Size of linked list: " + linkedListSize);
    }

    public static int solution(int[] A) {
        // Implement your solution here
        LinkedList<Integer> linkedList = new LinkedList<>();

        int negativeValue = -1;

        for (int i = 0; i < A.length; i++) {

            if (A[i] == negativeValue) {
                // skip next index
                i++;
            } else if (A[i] > 0) {
                linkedList.add(A[i]);
            }
        }

        // Add last value to linked list
        linkedList.addLast(negativeValue);

        System.out.println(linkedList.toString());
        return linkedList.size();
    }

}
