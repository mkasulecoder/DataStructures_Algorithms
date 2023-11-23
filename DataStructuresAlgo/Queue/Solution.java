package DataStructuresAlgo.Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * This structure is almost similar to the stack as the data is stored
 * sequentially. The difference is that the queue data structure follows FIFO
 * which is the rule of First In-First Out where the first added element is to
 * exit the queue first. Front and rear are the two terms to be used in a queue.
 * 
 * Enqueue is the insertion operation and dequeue is the deletion operation. The
 * former is performed at the end of the queue and the latter is performed at
 * the start end. The data structure might be explained with the example of
 * people queuing up to ride a bus. The first person in the line will get the
 * chance to exit the queue while the last person will be the last to exit.
 */
public class Solution {

    public static void main(String[] args) {
        printQueue();
    }

    public static void printQueue() {

        // We instantiate the queue to Linkedin list cause queue is an interface
        Queue<String> queue = new LinkedList<>();

        // add to queue with .add() or offer() methods
        queue.offer("Rae");
        queue.offer("Marc");
        queue.offer("Lael");
        queue.offer("Dennis");
        queue.add("Michael");

        // remove from queue with .remove() or poll() methods
        queue.remove();
        queue.poll();

        // get first object from queue
        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(List.of(queue));

        // get the size of queue
        System.out.println(queue.size());

        // We cant get the item from queue by index

    }
}
