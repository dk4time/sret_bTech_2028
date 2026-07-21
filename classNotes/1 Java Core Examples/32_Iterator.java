/*
 * Topic: Iterator
 * Core idea: the mechanism that powers every enhanced for-each loop under the
 * hood, and the ONLY safe way to remove elements from a collection while
 * traversing it - modifying a collection directly during a for-each throws
 * ConcurrentModificationException.
 */

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        // hasNext() / next() | Iterator | Params: None | Returns: boolean / element | O(1)
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int value = it.next();
            System.out.println(value);
        }

        // The unsafe way - removing from a List directly during a for-each
        try {
            for (int n : numbers) {
                if (n % 2 == 0) {
                    numbers.remove(Integer.valueOf(n));   // modifies the list mid-iteration
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught: modifying a collection during for-each is unsafe");
        }

        // The safe way - Iterator.remove() | Params: None | Returns: void | O(1) after the current next()
        List<Integer> toClean = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Iterator<Integer> cleaner = toClean.iterator();
        while (cleaner.hasNext()) {
            if (cleaner.next() % 2 == 0) {
                cleaner.remove();
            }
        }
        System.out.println(toClean);   // all even numbers safely removed

        // ListIterator - Iterator's bidirectional cousin, only on List types,
        // adds hasPrevious()/previous() and even in-place set()
        java.util.ListIterator<Integer> listIterator = toClean.listIterator();
        while (listIterator.hasNext()) {
            int value = listIterator.next();
            listIterator.set(value * 10);   // safe in-place modification
        }
        System.out.println(toClean);
    }
}
