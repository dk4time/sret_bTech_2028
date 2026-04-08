package com.greedy.com;
import java.util.PriorityQueue;
public class MinCostRopeConnect {
	    public static int minCost(int[] ropes) {
	   PriorityQueue<Integer>pq=new PriorityQueue<>();
	   for(int rope:ropes) {
		   pq.add(rope);
	   }
	   int totalcost=0;
	   while(pq.size()>1) {
		   int first=pq.poll();
		   int second=pq.poll();
		   int cost=first+second;
		   totalcost+=cost;
	   }
	   return totalcost;
	    }
	    public static void main(String[] args) {
	        int[] ropes = {4, 3, 2, 6};
	        System.out.println(minCost(ropes));
	    }
	}

