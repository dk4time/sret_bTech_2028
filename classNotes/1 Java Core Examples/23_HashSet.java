/*
 * Topic: HashSet
 * Core idea: backed by a HashMap internally - O(1) average add/remove/contains,
 * but NO ordering guarantee at all (not insertion order, not sorted order).
 * The fastest of the three Set implementations; use it whenever you don't
 * care about order, only uniqueness and fast membership checks.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>(Set.of(10, 20, 30, 40));
        System.out.println(numbers);   // order is not guaranteed to match insertion

        // add(item) | HashSet | Params: item (Required) | Returns: boolean | O(1) average
        numbers.add(50);

        // addAll(collection) | HashSet | Params: collection (Required) | Returns: boolean | O(k)
        numbers.addAll(Set.of(60, 70));

        // remove(item) | HashSet | Params: item (Required) | Returns: boolean | O(1) average
        // Never throws if the item is absent - just returns false
        numbers.remove(20);
        System.out.println(numbers.remove(999));

        // Removing an arbitrary element - HashSet has no pop(); use an Iterator
        Iterator<Integer> iterator = numbers.iterator();
        int popped = iterator.next();
        iterator.remove();
        System.out.println(popped);

        // Set algebra
        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> b = new HashSet<>(Set.of(3, 4, 5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference: " + difference);

        System.out.println(a.contains(3));
    }
}
