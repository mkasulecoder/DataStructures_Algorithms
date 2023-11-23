package DataStructuresAlgo.ArrayLists;

/**
 * LinkedList should be used where modifications to a collection are frequent like addition/deletion operations. LinkedList is much faster as compare to ArrayList in such cases. In case of read-only collections or collections which are rarely modified, ArrayList is suitable.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        arrayListPrint();
    }

    public static void arrayListPrint() {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("Rae", "mark", "Lael", "Micheal"));

        // get size of word list
        System.out.println(wordList.size());

        // check if word exists in list
        if (wordList.contains("Lael")) {
            System.out.println("Lael");
        }
        // set or update word at index
        System.out.println('\n');
        if (wordList.contains("Lael")) {
            wordList.set(wordList.indexOf("Lael"), "Lael K");
            // print the updated word
            System.out.println("index of Lael K" + wordList.indexOf("Lael K"));
        }

        // get word at given index
        System.out.println("Word at index 1: " + wordList.get(1));

        // add new word to list
        System.out.println("Add word to list " + wordList.add("Dennis"));

        System.out.println('\n');
        // Loop through words with for-each
        for (String word : wordList) {
            System.out.println(word);
        }

        // loop through using Iterator
        System.out.println('\n');
        Iterator<String> iterable = wordList.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

        // Convert to Array
        String[] array = new String[wordList.size()];
        array = wordList.toArray(array);

        System.out.println(List.of(array));
        System.out.println('\n');

        // Check if Array is empty
        System.out.println("Check to see if list is empty" + wordList.isEmpty());

        // Sort in ascending order
        wordList.sort(Comparator.naturalOrder());
        System.out.println(wordList);

        // Sort in descending order
        wordList.sort(Comparator.reverseOrder());
        System.out.println(wordList);

        // remove all words from arraylist
        wordList.clear();

        // Will alow null values
        wordList.add(null);
        wordList.add(null);

        System.out.println(List.of(wordList));

    }
}
