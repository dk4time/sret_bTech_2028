package com.dp.com;
import java.util.*;
public class GridDp2 {
	    public static void main(String[] args) {

	        // Example grid (0 = free, 1 = obstacle)
	        int[][] obstacleGrid = {
	            {0, 0, 0},
	            {0, 1, 0},
	            {0, 0, 0}
	        };

	        Solution obj = new Solution();
	        int result = obj.uniquePathsWithObstacles(obstacleGrid);

	        System.out.println("Number of Unique Paths: " + result);
	    }
	}

	class Solution {

	    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

	        int m = obstacleGrid.length;        // number of rows
	        int n = obstacleGrid[0].length;     // number of columns

	        int[][] dp = new int[m][n];         // DP array

	        // Step 1: Starting point
	        if (obstacleGrid[0][0] == 1) {
	            return 0;  // start blocked
	        }

	        dp[0][0] = 1;

	        // Step 2: First column
	        for (int i = 1; i < m; i++) {
	            if (obstacleGrid[i][0] == 0) {
	                dp[i][0] = dp[i - 1][0];  // from top
	            } else {
	                dp[i][0] = 0;             // obstacle
	            }
	        }

	        // Step 3: First row
	        for (int j = 1; j < n; j++) {
	            if (obstacleGrid[0][j] == 0) {
	                dp[0][j] = dp[0][j - 1];  // from left
	            } else {
	                dp[0][j] = 0;             // obstacle
	            }
	        }

	        // Step 4: Fill remaining grid
	        for (int i = 1; i < m; i++) {
	            for (int j = 1; j < n; j++) {

	                if (obstacleGrid[i][j] == 1) {
	                    dp[i][j] = 0;  // blocked
	                } else {
	                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
	                }
	            }
	        }

	        return dp[m - 1][n - 1];  // final answer
	    }
	}

