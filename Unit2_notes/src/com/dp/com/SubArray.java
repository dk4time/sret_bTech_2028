package com.dp.com;
public class SubArray {

    public static void main(String[] args) {

        // Input array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call function
        int result = maxSubArray(nums);

        // Print result
        System.out.println("Maximum Subarray Sum = " + result);
    }

    // Kadane's Algorithm Function
    public static int maxSubArray(int[] nums) {

        // Step 1: Initialize
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Step 2: Loop through array
        for (int i = 1; i < nums.length; i++) {

            // Step 3: Either start new subarray or extend existing
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Step 4: Update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        // Step 5: Return result
        return maxSum;
    }
}

