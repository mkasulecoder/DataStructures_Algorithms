package DataStructuresAlgo.LinkedList;

/**
 * LinkedList should be used where modifications to a collection are frequent like addition/deletion operations. LinkedList is much faster as compare to ArrayList in such cases. In case of read-only collections or collections which are rarely modified, ArrayList is suitable.
 */
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        linkedListPrinter();
    }

    public static void linkedListPrinter() {
        // instantiate a new linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add num to linked list
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        // get num at specified index
        linkedList.get(3);

        // update linked list at specified index
        linkedList.set(3, 4);

        // remove or delete element from a given index
        linkedList.remove(3);

        // remove or delete the first element in the linked list
        // store this element
        int removedValue = linkedList.remove();
        System.out.printf("THe removed value is %d%n", removedValue);

        // loop through all elements
        for (int num : linkedList) {
            System.out.println(num);
        }

        System.out.println('\n');

        // loop through array
        Iterator<Integer> nums = linkedList.iterator();

        while (nums.hasNext()) {
            System.out.printf("%d ,", nums.next());
        }
        // get the size
        System.out.println(linkedList.size());

        // check if the element exits in the list
        System.out.printf("Does the element exits in the list %s%n", linkedList.contains(4));

        // check if linkedlist is empty
        System.out.println(linkedList.isEmpty());

        // add item to first index in list
        linkedList.addFirst(2);

        // add items to end of list
        linkedList.addLast(4);

        // add items to particular indx
        linkedList.add(3, 5);

        // add items to list
        linkedList.add(99);
        linkedList.add(99);
        linkedList.add(null);

        System.out.println("List with duplicates: " + List.of(linkedList));

        // remove all items from list
        linkedList.clear();
        System.out.println(List.of(linkedList));
    }
}
