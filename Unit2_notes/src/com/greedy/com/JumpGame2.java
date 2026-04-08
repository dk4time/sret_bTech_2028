package com.greedy.com;
public class JumpGame2 {
   public static  int Jump(int[]nums) {
	   int jumps=0;
	   int farthest=0;//maximum index covered
	   int currentend=0;//current marks the boundary of jump
	   for(int i=1;i<nums.length;i++) {
		  farthest=Math.max(farthest, i+nums[i]);
	   
	   if(i==currentend) {
		   jumps++;
		   currentend=farthest;
	   }
	   }
	   return jumps;
   }
   public static void main(String[]args) {
	   int[]nums= {2,1,4,5,3,7};
	   System.out.println(Jump(nums));  
   }
   }

