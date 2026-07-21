/*
 * Topic: ArrayList
 * Core idea: a resizable array under the hood - fast random access (O(1)),
 * but insertion/removal in the middle costs O(n) because later elements
 * have to shift. Reach for this when you read far more than you insert/remove.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40));
        System.out.println(numbers);

        // get(index) / set(index, value) | ArrayList | Params: index (Required) | Returns: element | O(1)
        System.out.println(numbers.get(0));
        numbers.set(1, 25);

        // subList(from, to) - Java's slicing | ArrayList | Params: 2 Required | Returns: List view | O(1)
        System.out.println(numbers.subList(1, 3));

        // add(item) | ArrayList | Params: item (Required) | Returns: boolean | O(1) amortized
        numbers.add(50);

        // add(index, item) | ArrayList | Params: 2 Required | Returns: void | O(n) - shifts everything after index
        numbers.add(1, 15);
        System.out.println(numbers);

        // remove(Object item) | ArrayList | Params: item (Required) | Returns: boolean | O(n)
        // Ambiguous with remove(index) for ArrayList<Integer> - use Integer.valueOf() to force removal by value
        numbers.remove(Integer.valueOf(30));

        // remove(index) | ArrayList | Params: index (Required) | Returns: element | O(1) at the end, O(n) elsewhere
        int removed = numbers.remove(numbers.size() - 1);
        System.out.println(removed + " " + numbers);

        // indexOf(item) | ArrayList | Params: item (Required) | Returns: int | O(n)
        System.out.println(numbers.indexOf(25));

        // Collections.sort() / Collections.reverse() | Collections (static) | Params: list (Required) | Returns: void | O(n log n) / O(n)
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);

        // size() | ArrayList | Params: None | Returns: int | O(1)
        System.out.println(numbers.size());

        for (int n : numbers) System.out.println(n);
        System.out.println(numbers.contains(20));
    }
}
