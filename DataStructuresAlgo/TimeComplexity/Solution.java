package DataStructuresAlgo.TimeComplexity;

public class Solution {

    public static void main(String[] args) {

        double firstTimeNow = System.currentTimeMillis();
        calcSum1(999999);
        System.out.println("Time time for " + calcSum1(99) + " method is "
                + (System.currentTimeMillis() - firstTimeNow) + " ms");

        double secondTimeNow = System.currentTimeMillis();
        calcSum2(999999);
        System.out.println("Time time for " + calcSum2(99) + " method is "
                + (System.currentTimeMillis() - secondTimeNow) + " ms");

    }

    /**
     * shorter version to calc sum of natural number
     * 
     * @param n
     * @return
     */
    public static int calcSum1(int n) {
        return n * (n + 1) / 2;
    }

    /**
     * longer version to calc sum of natural number
     * 
     * @param n
     * @return
     */
    public static int calcSum2(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += n;
        }

        return sum;
    }

}
