package com.dp.com;

import java.util.*;

public class Selection {

    public static int rob(int[] nums) {

        int n = nums.length;

        // Edge case: only one house
        if (n == 1) {
            return nums[0];
        }

        // DP array
        int[] dp = new int[n];

        // Base cases
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Fill DP array
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of houses:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter money in each house:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = rob(nums);

        System.out.println("Maximum money that can be robbed: " + result);

        sc.close();
    }
}