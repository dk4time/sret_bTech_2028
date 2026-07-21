/*
 * Topic: LinkedHashMap
 * Core idea: a HashMap that also maintains insertion order (or, optionally,
 * access order) via an internal doubly-linked list. Same O(1) average
 * performance as HashMap, plus predictable iteration order - the standard
 * building block for an LRU cache.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> visitCounts = new LinkedHashMap<>();
        visitCounts.put("home", 1);
        visitCounts.put("about", 1);
        visitCounts.put("home", 2);   // updates the existing key, position unchanged

        System.out.println(visitCounts);   // home, about - insertion order preserved


        // Access-order mode + removeEldestEntry() together build a simple LRU cache -
        // a very common placement-round design question
        final int capacity = 3;
        LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > capacity;
            }
        };

        lruCache.put(1, "A");
        lruCache.put(2, "B");
        lruCache.put(3, "C");
        lruCache.get(1);          // touching key 1 marks it "recently used"
        lruCache.put(4, "D");     // capacity exceeded - evicts the least recently used (key 2)

        System.out.println(lruCache.keySet());   // 3, 1, 4 - key 2 was evicted
    }
}
