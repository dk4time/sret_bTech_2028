package com.dp.com;

	import java.util.*;
public class Prefix{
	    public static int[] productExceptSelf(int[] nums) {

	        int n = nums.length;

	        int[] result = new int[n];

	        // Step 1: Prefix (left product)
	        result[0] = 1;

	        for (int i = 1; i < n; i++) {
	            result[i] = result[i - 1] * nums[i - 1];
	        }

	        // Step 2: Suffix (right product)
	        int right = 1;

	        for (int i = n - 1; i >= 0; i--) {
	            result[i] = result[i] * right;
	            right = right * nums[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of array:");
	        int n = sc.nextInt();

	        int[] nums = new int[n];

	        System.out.println("Enter array elements:");

	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }

	        int[] result = productExceptSelf(nums);

	        System.out.println("Output:");

	        for (int i = 0; i < n; i++) {
	            System.out.print(result[i] + " ");
	        }

	        sc.close();
	    }
	}
   
    