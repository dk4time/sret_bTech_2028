/*
 * Topic: LinkedHashSet
 * Core idea: a HashSet that also maintains a doubly-linked list running
 * through its entries, so iteration order always matches insertion order.
 * Same O(1) average performance as HashSet, with a small memory overhead for
 * the ordering. Use it when uniqueness AND predictable order both matter -
 * e.g. deduplicating a list while preserving its original order.
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> visitOrder = new LinkedHashSet<>();
        visitOrder.add("Chennai");
        visitOrder.add("Mumbai");
        visitOrder.add("Chennai");   // duplicate - ignored, position unchanged
        visitOrder.add("Delhi");

        System.out.println(visitOrder);   // prints Chennai, Mumbai, Delhi - insertion order preserved

        // A very common real use: deduplicate a list without losing order
        java.util.List<Integer> withDuplicates = java.util.List.of(3, 1, 3, 2, 1, 4);
        LinkedHashSet<Integer> deduplicated = new LinkedHashSet<>(withDuplicates);
        System.out.println(deduplicated);   // 3, 1, 2, 4 - first-seen order, no duplicates

        System.out.println(visitOrder.contains("Mumbai"));
        visitOrder.remove("Mumbai");
        System.out.println(visitOrder);
    }
}
