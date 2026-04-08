package com.greedy.com;
public class MaxOverlappingInterval {
	public static void main(String[] args) {
        int[][] arr = {
                {1,4},
                {2,5},
                {5,6},
                {7,8}
        };
        //sweep line-start(+1),end(-1)using timeline chart
        int []timeline=new int[10];
        for(int []a:arr) {
              timeline[a[0]]++;
              timeline[a[1]]--;
        }
        int cur=0;
        int max=0;
        for(int i=0;i<timeline.length-1;i++) {
        	cur+=timeline[i];
        	max=Math.max(cur, max);//maximum overlapping count
        }
        System.out.println("Max overlapping interval"+max);
}
}