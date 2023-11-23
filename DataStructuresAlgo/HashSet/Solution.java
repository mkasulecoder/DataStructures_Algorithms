package DataStructuresAlgo.HashSet;

import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        // Creating a HashSet

        HashSet<String> hashSet = new HashSet<>();

        // Adding elements

        hashSet.add("Apple");

        hashSet.add("Banana");

        hashSet.add("Orange");

        hashSet.add("Apple"); // Duplicate, will not be added
        hashSet.add(null); // null will be added

        // Print the HashSet

        System.out.println("HashSet: " + hashSet);

        // Check if an element is present

        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

        // Remove an element

        hashSet.remove("Orange");

        // Print the modified HashSet

        System.out.println("Modified HashSet: " + hashSet);

        // Looping over the HashSet using an enhanced for loop
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        System.out.println('\n');

        hashSet.remove("Banana");

        System.out.println('\n');
        System.out.println(List.of(hashSet));

    }

}
