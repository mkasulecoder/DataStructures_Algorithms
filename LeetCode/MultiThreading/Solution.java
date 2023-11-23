package LeetCode.MultiThreading;

public class Solution {
    public static void main(String[] args) {

        // Thread class
        for (int i = 0; i <= 3; i++) {
            MultiThread myMultiThread = new MultiThread();
            System.out.println("myMultiThread at " + i);
            myMultiThread.start();
        }

        // Runnable class
        for (int i = 0; i <= 3; i++) {
            RunnableClass myRunnableClass = new RunnableClass();
            // we need an extra class to implement Thread
            Thread myThread = new Thread(myRunnableClass);

            myThread.start(); // starts the thread

            // try {
            //     myThread.join(); // defeats purpose of the thread as it waits fo thread to complete before
            //     // another thread runs
            // } catch (Exception e) {
            //     e.printStackTrace();
            // }

            // checks if thread is active
            boolean isAlive = myThread.isAlive();
            System.out.println(isAlive);
        }

    }
}