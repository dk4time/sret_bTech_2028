package phase1.arrays;

import java.util.Arrays;

public class Example2 {

    public static void main(String[] args) {

        // =====================================
        // 1. Arrays.toString() – 1D Array
        // =====================================
        int arr[] = {40, 10, 30, 20};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // =====================================
        // 2. Arrays.sort()
        // =====================================
        Arrays.sort(arr);   // sorts in ascending order

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));

        // =====================================
        // 3. Arrays.binarySearch()
        // =====================================
        /*
         * IMPORTANT:
         * binarySearch works ONLY on sorted arrays
         * Returns index if found
         * Returns negative value if not found
         */
        int key = 30;
        int index = Arrays.binarySearch(arr, key);

        System.out.println("Index of " + key + ": " + index);

        // =====================================
        // 4. Arrays.equals() – 1D Array
        // =====================================
        int arr2[] = {10, 20, 30, 40};

        System.out.println("arr equals arr2: " + Arrays.equals(arr, arr2));

        // =====================================
        // 5. Arrays.copyOf()
        // =====================================
        int copy1[] = Arrays.copyOf(arr, arr.length);

        System.out.println("copyOf full array:");
        System.out.println(Arrays.toString(copy1));

        // =====================================
        // 6. Arrays.copyOfRange()
        // =====================================
        int copy2[] = Arrays.copyOfRange(arr, 1, 3); // end index excluded

        System.out.println("copyOfRange (index 1 to 2):");
        System.out.println(Arrays.toString(copy2));

        // =====================================
        // 7. Arrays.fill()
        // =====================================
        int fillArr[] = new int[5];

        Arrays.fill(fillArr, 99);

        System.out.println("After fill:");
        System.out.println(Arrays.toString(fillArr));

        // =====================================
        // 8. Arrays.deepToString() – 2D Array
        // =====================================
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("2D Array using deepToString:");
        System.out.println(Arrays.deepToString(matrix));

        // =====================================
        // 9. Arrays.deepEquals() – 2D Array
        // =====================================
        int matrix2[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("matrix equals matrix2: "
                + Arrays.deepEquals(matrix, matrix2));
    }
}
