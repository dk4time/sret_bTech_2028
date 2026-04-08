package com.dp.com;
	import java.util.*;
	public class MixedDp{
	    public static void main(String[] args) {
	        // Step 1: Create triangle input
	        List<List<Integer>> triangle = new ArrayList<>();
	        triangle.add(Arrays.asList(2));
	        triangle.add(Arrays.asList(3, 4));
	        triangle.add(Arrays.asList(6, 5, 7));
	        triangle.add(Arrays.asList(4, 1, 8, 3));

	        // Step 2: Call function
	        int result = minimumTotal(triangle);

	        // Step 3: Print result
	        System.out.println("Minimum Path Sum = " + result);
	    }

	    public static int minimumTotal(List<List<Integer>> triangle) {

	        // Step 4: Create dp array
	        int n = triangle.size();
	        int[] dp = new int[n];

	        // Step 5: Copy last row into dp
	        for (int i = 0; i < n; i++) {
	            dp[i] = triangle.get(n - 1).get(i);
	        }

	        // Step 6: Bottom-up calculation
	        for (int i = n - 2; i >= 0; i--) {
	            for (int j = 0; j <= i; j++) {

	                // current + min(down, diagonal)
	                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
	            }
	        }

	        // Step 7: Return answer
	        return dp[0];
	    }
	}

