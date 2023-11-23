package DataStructuresAlgo.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class OutOfBounds {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }

        System.out.println('\n');

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + list.get(i));
        }
    }
}
