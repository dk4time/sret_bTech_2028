/*
 * Topic: Array
 * Core idea: the array is Java's native, fixed-size sequence type - simplest,
 * fastest, and the one every Collections class is ultimately built on top of.
 * (The resizable alternative, ArrayList, gets its own file in the Collections
 * section - this file is about the raw language feature.)
 */

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // Declaration and initialization
        int[] scores = {10, 20, 30, 40};
        int[] empty = new int[5];   // fixed size 5, defaults to all zeros

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(empty));

        // Access and update
        System.out.println(scores[0]);
        scores[1] = 25;
        System.out.println(Arrays.toString(scores));

        // length is a FIELD, not a method (no parentheses)
        System.out.println(scores.length);

        // Traversal
        for (int score : scores) {
            System.out.println(score);
        }

        // A fixed size means "inserting" or "deleting" really means copying
        // into a new, differently-sized array - there is no built-in resize.
        int[] grown = Arrays.copyOf(scores, scores.length + 1);
        grown[grown.length - 1] = 50;
        System.out.println(Arrays.toString(grown));

        // Arrays.sort() | Arrays (static) | Params: array (Required) | Returns: void | O(n log n)
        int[] toSort = {40, 10, 30, 20};
        Arrays.sort(toSort);
        System.out.println(Arrays.toString(toSort));

        // Arrays.binarySearch() - only valid on an already-sorted array
        // Arrays (static) | Params: array, target (Required) | Returns: int | O(log n)
        System.out.println(Arrays.binarySearch(toSort, 30));

        // Arrays.equals() - compares CONTENT; == on two arrays compares references
        int[] copy = toSort.clone();
        System.out.println(toSort == copy);
        System.out.println(Arrays.equals(toSort, copy));

        // 2D array (a "matrix")
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println(matrix[1][0]);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
