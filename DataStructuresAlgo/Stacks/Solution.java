package DataStructuresAlgo.Stacks;

/**
 * The data structure follows the rule of LIFO (Last In-First Out) 
 * where the data last added element is removed first. 
 * Push operation is used for adding an element of data on a stack and 
 * the pop operation is used for deleting the data from the stack. 
 * This can be explained by the example of books stacked together. 
 * In order to access the last book, all the books placed on top of 
 * the last book have to be safely removed.
 */
import java.util.List;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution.printStackList();
    }

    public static void printStackList() {

        // this has less features since it comes from a vector class
        // alternatively use LinkedList
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(null);
        stack.push(4);
        stack.push(99);
        stack.push(23);

        // get last element in the stack
        Integer num = stack.peek();
        Integer firstNum = stack.firstElement();
        Integer lastNum = stack.lastElement();
        Integer searchValue = stack.elementAt(0);

        System.out.println(List.of(stack));
        System.out.println("first num: " + firstNum);
        System.out.println("last num: " + num);
        System.out.println("last num: " + lastNum);
        System.out.println("Find index in stack at index 0: " + searchValue);

    }

}
