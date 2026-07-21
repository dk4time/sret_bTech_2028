/*
 * Topic: TreeMap
 * Core idea: backed by a red-black tree, keys are always kept sorted, and
 * get/put/remove cost O(log n) instead of HashMap's O(1). Use it whenever you
 * need a running sorted map, or its range/navigation methods.
 */

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Charlie", 78);
        marks.put("Alice", 92);
        marks.put("Bob", 85);

        System.out.println(marks);              // always iterates in key order

        // firstKey() / lastKey() | TreeMap | Params: None | Returns: key | O(log n)
        System.out.println(marks.firstKey() + " " + marks.lastKey());

        // ceilingKey() / floorKey() - nearest existing key at or above/below a given key
        // Params: key (Required) | Returns: key | O(log n)
        System.out.println(marks.ceilingKey("Ba"));   // "Bob" - smallest key >= "Ba"
        System.out.println(marks.floorKey("Ba"));     // "Alice" - largest key <= "Ba"

        // headMap() / tailMap() - sorted sub-views | Params: key (Required) | Returns: SortedMap | O(log n)
        System.out.println(marks.headMap("Bob"));   // everything with a key before "Bob"
        System.out.println(marks.tailMap("Bob"));   // "Bob" onward

        // Sorting by value instead of key needs a manual step - TreeMap only
        // ever sorts by key
        marks.entrySet().stream()
                .sorted(java.util.Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
