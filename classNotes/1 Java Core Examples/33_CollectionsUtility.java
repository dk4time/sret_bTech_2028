/*
 * Topic: Collections (the utility class) and Comparator vs Comparable
 * Core idea: java.util.Collections holds static helper methods that operate
 * ON a List/Set/Map - it is not a collection itself. Several of the classes
 * in this set (TreeSet, TreeMap, PriorityQueue) depend on the sorting rules
 * defined here, via either Comparable (built into the object) or Comparator
 * (supplied externally) - so this file ties the whole Collections section together.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsUtility {

    // Comparable: the class itself defines its "natural order" via compareTo()
    record Student(String name, int marks) implements Comparable<Student> {
        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.marks, other.marks);   // natural order: ascending marks
        }
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 8, 1, 9, 2));

        // Collections.sort() | Collections (static) | Params: list (Required), comparator (Optional) | Returns: void | O(n log n)
        Collections.sort(numbers);
        System.out.println(numbers);

        // Collections.reverse() | Params: list (Required) | Returns: void | O(n)
        Collections.reverse(numbers);
        System.out.println(numbers);

        // Collections.max() / Collections.min() | Params: collection (Required) | Returns: element | O(n)
        System.out.println(Collections.max(numbers) + " " + Collections.min(numbers));

        // Collections.shuffle() | Params: list (Required) | Returns: void | O(n)
        Collections.shuffle(numbers);
        System.out.println(numbers);

        // Collections.frequency() | Params: collection, item (Required) | Returns: int | O(n)
        System.out.println(Collections.frequency(List.of(1, 2, 1, 3, 1), 1));

        // Collections.unmodifiableList() - a read-only VIEW; the original list can still change underneath it
        // Params: list (Required) | Returns: List | O(1)
        List<Integer> readOnly = Collections.unmodifiableList(numbers);
        try {
            readOnly.add(100);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify an unmodifiable view");
        }


        // Comparable in action - sorting Students uses their own compareTo()
        List<Student> students = new ArrayList<>(List.of(
                new Student("John", 85),
                new Student("Alice", 92),
                new Student("Bob", 78)
        ));
        Collections.sort(students);   // uses Student's natural order (by marks)
        System.out.println(students);

        // Comparator - an externally supplied order, doesn't touch the class at all.
        // Useful when you need a DIFFERENT order than the natural one, or the
        // class doesn't implement Comparable in the first place.
        students.sort(Comparator.comparing(Student::name));
        System.out.println(students);

        // Chaining comparators: sort by marks descending, then by name for ties
        students.sort(
                Comparator.comparingInt(Student::marks).reversed()
                        .thenComparing(Student::name)
        );
        System.out.println(students);
    }
}
