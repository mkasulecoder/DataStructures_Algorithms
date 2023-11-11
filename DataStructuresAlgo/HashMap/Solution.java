package DataStructuresAlgo.HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        hashMapPrinter();
    }

    public static void hashMapPrinter() {

        // Intialization
        HashMap<String, String> hashMapList = new HashMap<>();

        // Adding key value to hashmap list
        hashMapList.put("UG", "Kampala");
        hashMapList.put("KY", "Nairobi");
        hashMapList.put("TZ", "Dodoma");

        System.out.println(List.of(hashMapList));

        // Update key-value to hashmap list
        hashMapList.put("TZ", "Dar es Salaam");
        System.out.println(List.of(hashMapList));

        // Access value by key
        String cityName = hashMapList.get("KY");
        System.out.println("The city is " + cityName);

        // Check if key for city exists
        System.out.println("Does Kenya exist: " + hashMapList.containsKey("KY"));

        // Remove element from hashMap
        String removedCity = hashMapList.remove("KY");
        System.out.printf("The removed city %s%n", removedCity);

        // Size of hashMap
        System.out.printf("The size of the hash list is %d%n", hashMapList.size());
        System.out.println('\n');

        // Loop over hashMap
        // by KEYS
        for (String key : hashMapList.keySet()) {
            System.out.println("Key- " + key + " : " + hashMapList.get(key));
        }
        System.out.println('\n');
        // by key value
        for (Map.Entry<String, String> entry : hashMapList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Allowing NULL keys and values
        hashMapList.put(null, "Unknown City");
        hashMapList.put("Solomon's Island", null);

        System.out.println('\n');

        for (Map.Entry<String, String> newEntry : hashMapList.entrySet()) {
            System.out.println(newEntry.getKey() + " : " + newEntry.getValue());
        }

        // Checking Key or Value Existence:
        System.out.println("Is null a key in hashmap: " + hashMapList.containsKey(null));
        System.out.println("Is null a value in the list: " + hashMapList.containsValue(null));
        System.out.println('\n');

        // Merging Maps:
        HashMap<String, String> newHashMap = new HashMap<>();
        newHashMap.put("MD", "Silver Spring");
        hashMapList.putAll(newHashMap);
        System.out.println(List.of(hashMapList));
        System.out.println('\n');

        // Compute new values for keys
        hashMapList.put("RW", null);
        hashMapList.put("RW", null);
        System.out.println("List with duplicates: " + List.of(hashMapList));
        System.out.println('\n');

        hashMapList.compute("RW", (key, value) -> "Kigali");
        hashMapList.computeIfPresent("UG", (key, value) -> "Entebbe");

        System.out.println(List.of(hashMapList));

        /**
         * HashMap handles collisions using a linked list
         * If the number of elements in a bucket becomes large, the linked list switches
         * to a tree for better performance.
         **/

        /**
         * Load factor: The threshold at which the capacity of the HashMap is increased
         * Capacity: The number of buckets in the hash table
         **/

    }

}
