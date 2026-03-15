package com.greedy.com;
import java.util.*;
public class MergeIntervals {
	    public static void main(String[] args) {
	        int[][] intervals = {
	            {1, 3},//(starttime,endtime)
	            {2, 6},
	            {8, 10},
	            {15, 18}
	        };
	     Arrays.sort(intervals,(a,b)->a[0]-b[0]);//sort based on the starting time
	     int[]current=intervals[0];//to find non-overlaps
	     List <int[]>result=new ArrayList<>();
	     for(int i=1;i<intervals.length;i++) {
	    	 if(intervals[i][0]<=current[1]) {
	    		 current[1]=Math.max(intervals[i][1], current[1]);
	    	 }
	    	 else {
	    		 result.add(current);
	    		 current=intervals[i];
	    	 }
	     }
	     result.add(current);
	     for(int[]interval:intervals) {
	    	 System.out.println(intervals[0]+""+intervals[1]);
	     }
	    }
}

	     
	     
	    
	

