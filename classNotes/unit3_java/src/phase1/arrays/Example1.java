package phase1.arrays;

public class Example1 {

    public static void main(String[] args) {

        // =====================================
        // 0. Normal Variable (for comparison)
        // =====================================
        int a = 10;    // declaration + initialization
        System.out.println("a = " + a);

        // =====================================
        // 1. ARRAY DECLARATION
        // =====================================
        int array1[];  // declaration only (no memory allocated)

        // =====================================
        // 2. ARRAY INSTANTIATION
        // =====================================
        array1 = new int[5];   // memory allocated for 5 integers

        // =====================================
        // 3. ARRAY INITIALIZATION
        // =====================================
        array1[0] = 100;
        array1[1] = 200;

        // =====================================
        // Declaration + Initialization (Literal)
        // =====================================
        int array2[] = {10, 20, 30};

        // =====================================
        // Declaration first, instantiation later
        // =====================================
        int array3[];
        array3 = new int[4];

        // =====================================
        // Multiple array declarations
        // =====================================
        int[] a1, a2, a3;   // all are int arrays
        a2 = new int[3];

        // =====================================
        // length property
        // =====================================
        System.out.println("array2 length: " + array2.length);

        // =====================================
        // Traversing array – for loop
        // =====================================
        System.out.print("array2 elements (for loop): ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // =====================================
        // Traversing array – enhanced for loop
        // =====================================
        System.out.println("array2 elements (enhanced for):");
        for (int num : array2) {
            System.out.println(num);
        }

        // =====================================
        // clone() – Deep copy for 1D array
        // =====================================
        int array4[] = array2.clone();

        array4[0] = 999;   // modifying cloned array

        // original array is NOT affected
        System.out.println("array2[0]: " + array2[0]);
        System.out.println("array4[0]: " + array4[0]);

        // =====================================
        // 2D ARRAY (Matrix)
        // =====================================
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("2D Array (Matrix):");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        // =====================================
        // Jagged Array (Uneven Columns)
        // =====================================
        int matrix2[][] = {
                {10, 20, 25},
                {30, 40}
        };

        System.out.println("Jagged Array:");
        for (int r = 0; r < matrix2.length; r++) {
            for (int c = 0; c < matrix2[r].length; c++) {
                System.out.print(matrix2[r][c] + " ");
            }
            System.out.println();
        }

        // =====================================
        // clone() on 2D array (Shallow Copy)
        // =====================================
        int matrixClone[][] = matrix.clone();

        matrix[0][0] = 999;   // modifying original

        System.out.println("matrixClone[0][0]: " + matrixClone[0][0]);
        // change reflects in clone because 2D clone is SHALLOW
    }
}

/*
 * ARRAY:
 * - Collection of similar data types
 * - Stored in contiguous memory locations
 *
 * IMPORTANT POINTS:
 * - array.length → property, not method
 * - 1D array clone() → deep copy
 * - 2D array clone() → shallow copy
 * - Jagged array → rows with different column sizes
 */
