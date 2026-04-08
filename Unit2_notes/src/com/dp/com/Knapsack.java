package com.dp.com;
	class KnapsackDP {
	    static int knapsack(int[] wt, int[] val, int n, int W) {
	        int[][] dp = new int[n + 1][W + 1];
	        for (int i = 0; i <= n; i++) {
	            for (int w = 0; w <= W; w++) {
	                if (i == 0 || w == 0) {
	                    dp[i][w] = 0;
	                }
	                else if (wt[i - 1] <= w) {
	                    int take = val[i - 1] + dp[i - 1][w - wt[i - 1]];
	                    int notTake = dp[i - 1][w];
	                    dp[i][w] = Math.max(take, notTake);
	                }
	                else {
	                    dp[i][w] = dp[i - 1][w];
	                }
	            }
	        }
	        return dp[n][W];
	    }
	    public static void main(String[] args) {
	        int[] wt = {1, 2, 3};
	        int[] val = {10, 15, 40};
	        int W = 5;

	        System.out.println(knapsack(wt, val, wt.length, W));
	    }
	}
