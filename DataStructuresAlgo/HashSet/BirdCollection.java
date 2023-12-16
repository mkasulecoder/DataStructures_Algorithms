/**
 * Utility function to write output the UI"s textarea output.
 */
// function writeOutput(value) {
// document.getElementById("output").value += value + "\n";
// }

/**
 * The BioBlitz results are in! A team of citizen scientists went
 * to a local park. Each person wrote down the names of the birds
 * which they saw within the same 5 minute observation period.
 *
 * Given a list strings representing the combined list of all observed birds,
 * return the bird which was most frequently spotted. In the event of a tie,
 * return the first bird, alphabetically speaking.
 */

import java.util.*;

public class BirdCollection {

    public static void main(String[] args) {

        String[] birds = { "Sharp-Shinned Hawk", "Carolina Wren", "Downy Woodpecker", "Blue Jay", "Ovenbird",
                "Downy Woodpecker", "Common Grackle", "Carolina Wren", "Sharp-Shinned Hawk", "Common Grackle",
                "House Sparrow ", "Common Grackle", "Downy Woodpecker", "Ovenbird", "House Sparrow ",
                "Sharp-Shinned Hawk", "Common Grackle", "Downy Woodpecker", "Ovenbird" };

        System.out.println("The Winner is: " + commonBird(birds));

    }

    public static String commonBird(String[] birds) {

        HashSet<String> birdSet = new HashSet<>();

        String commonBird = birds[0];

        for (int i = 0; i < birds.length; i++) {
            if (birdSet.contains(birds[i])) {
                commonBird = birds[i];
            }
            birdSet.add(birds[i]);
        }
        return commonBird;

    }

}
