/*
 * Topic: TreeSet
 * Core idea: backed by a red-black tree, so elements are ALWAYS kept sorted,
 * and add/remove/contains cost O(log n) instead of HashSet's O(1) - the price
 * of maintaining that order. Use it whenever you need a running sorted,
 * duplicate-free collection, with O(log n) navigation methods on top.
 */

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> sorted = new TreeSet<>(java.util.Set.of(40, 10, 30, 20));
        System.out.println(sorted);           // always iterates in ascending order

        // first() / last() | TreeSet | Params: None | Returns: element | O(log n)
        System.out.println(sorted.first() + " " + sorted.last());

        sorted.add(25);
        System.out.println(sorted);

        // Navigation methods unique to TreeSet - none of these exist on HashSet
        // ceiling(x): smallest element >= x | floor(x): largest element <= x
        // higher(x): smallest element > x  | lower(x): largest element < x
        System.out.println(sorted.ceiling(22));   // 25
        System.out.println(sorted.floor(22));     // 20
        System.out.println(sorted.higher(25));    // 30
        System.out.println(sorted.lower(25));     // 20

        // headSet(x) / tailSet(x) - sorted sub-views | Params: x (Required) | Returns: SortedSet | O(log n)
        System.out.println(sorted.headSet(25));   // everything strictly less than 25
        System.out.println(sorted.tailSet(25));   // everything >= 25

        // Sorting in reverse - pass a custom Comparator at construction
        TreeSet<Integer> descending = new TreeSet<>(java.util.Comparator.reverseOrder());
        descending.addAll(sorted);
        System.out.println(descending);
    }
}
