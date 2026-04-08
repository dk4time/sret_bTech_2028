package com.greedy.com;
import java.util.*;
public class MinimumRoom {
	 public static void main(String[] args) {
	        int[][] arr = {
	                {1,4},//(0,1)
	                {2,5},//(starttime,endtime)
	                {3,6},
	                {7,8}
	        };
	      Arrays.sort(arr,(a,b)->a[0]-b[0]);//compare start time of activity(resources)
	      PriorityQueue <Integer>pq=new PriorityQueue<>();//heap memory storage
	      pq.add(arr[0][1]);
	      for(int i=0;i<=arr.length-1;i++) {
	    	  if(arr[i][0]>=pq.peek()) {//peek func will retreive most recent element 
	    		  //most recent element will be stored in its top
	    		  pq.poll();//it will free space
	    	  }
	    	  pq.add(arr[i][1]);
	      }
	    System.out.println("no.of.rooms used:"+pq.size());  //return total no.of elements
	      
	 }
}
	 

	      
	 
   


