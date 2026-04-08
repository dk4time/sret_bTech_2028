package com.dp.com;
import java.util.Scanner;
public class GridDp1 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter number of rows (m): ");
	        int m = sc.nextInt();

	        System.out.print("Enter number of columns (n): ");
	        int n = sc.nextInt();

	        // Call function
	        int result = uniquePaths(m, n);

	        // Output
	        System.out.println("Number of Unique Paths: " + result);

	        sc.close();
	    }

	    public static int uniquePaths(int m, int n) {

	        // Step 1: Create DP array
	        int[][] dp = new int[m][n];

	        // Step 2: Fill first row = 1
	        for (int j = 0; j < n; j++) {
	            dp[0][j] = 1;
	        }

	        // Step 3: Fill first column = 1
	        for (int i = 0; i < m; i++) {
	            dp[i][0] = 1;
	        }

	        // Step 4: Fill remaining cells
	        for (int i = 1; i < m; i++) {
	            for (int j = 1; j < n; j++) {

	                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

	            }
	        }

	        // Step 5: Return answer
	        return dp[m - 1][n - 1];
	    }
	}

