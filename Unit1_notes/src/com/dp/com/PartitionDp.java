package com.dp.com;
	import java.util.*;
	public class PartitionDp {

	    public static boolean canPartition(int[] nums) {

	        // Step 1: find total sum
	        int total = 0;
	        for (int num : nums) {
	            total += num;
	        }

	        // Step 2: if sum is odd → not possible
	        if (total % 2 != 0) {
	            return false;
	        }

	        int target = total / 2;

	        // Step 3: DP array
	        boolean[] dp = new boolean[target + 1];

	        // Step 4: base case
	        dp[0] = true;

	        // Step 5: process elements
	        for (int num : nums) {

	            // reverse loop (IMPORTANT)
	            for (int j = target; j >= num; j--) {

	                dp[j] = dp[j] || dp[j - num];
	            }
	        }

	        // Step 6: return result
	        return dp[target];
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] nums = new int[n];

	        // Input array
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }

	        // Call function
	        boolean result = canPartition(nums);

	        // Output
	        if (result) {
	            System.out.println("Can be partitioned into equal subset sum ✅");
	        } else {
	            System.out.println("Cannot be partitioned ❌");
	        }

	        sc.close();
	    }
	}
	
