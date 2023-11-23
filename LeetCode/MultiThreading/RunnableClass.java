package LeetCode.MultiThreading;

/**
 * Runnable class has an advantage over Threads because you can only
 * extend ONE class [Thread] yet we implement many classes
 * Its perfect to use when the current class will extend more than one class.
 */
public class RunnableClass implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread started at: " + i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
