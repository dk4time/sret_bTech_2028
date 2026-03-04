package com.greedy.com;
public class JumpGame {
	    public static boolean canReachEnd(int[] nums) {
	        int maxReach = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (i > maxReach) {
	                return false;
	            }
	            maxReach = Math.max(maxReach, i + nums[i]);
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        int[] nums = {2, 3, 1, 1, 4};
	        System.out.println(canReachEnd(nums));
	    }
	}

