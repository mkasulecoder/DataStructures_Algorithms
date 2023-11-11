package TwoDimensinal;
import java.util.List;

public class TwoDimensional {

    private static String[][] students = { { "Lion", "Tiger", "Tiger" }, { "Antelop", "Zebra", "Giraffe" },
            { "Panda", "Cobra", "Hippo" } };

    public static void main(String[] args) {

        for (int row = 0; row < students.length; row++) {
            for (int col = 0; col < students[row].length; col++) {
                System.out.println(students[row][col]);
            }
        }
    }
}