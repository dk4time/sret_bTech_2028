package com.greedy.com;
	import java.util.*;
	class Job {
	    int id;
	    int deadline;
	    int profit;
	    Job(int id, int deadline, int profit) {
	        this.id = id;
	        this.deadline = deadline;
	        this.profit = profit;
	    }
	}
	public class JobScheduling {
	    public static void main(String[] args) {
	        Job[] jobs = {
	            new Job(1, 2, 100),//jobid,jobdeadline,profit
	            new Job(2, 1, 50),
	            new Job(3, 2, 10),
	            new Job(4, 1, 20)
	        };
          Arrays.sort(jobs,(a,b)->b.profit-a.profit);
          int maxdeadline=0;//to find which has highest number of deadline
          for(Job job:jobs) {
        	  maxdeadline=Math.max(job.deadline, maxdeadline);
          }
          int [] slot=new int[maxdeadline+1];//with a max value 
          Arrays.fill(slot, -1);
          int totalprofit=0;
          for(Job job:jobs) {
        	  for(int j=job.deadline;j>0;j--) {
        		  if(slot[j]==-1) {
        			  slot[j]=job.id;
        			  totalprofit+=job.profit;
        			  break;
        			  
        		  }
        		  
        	  }
          }
	    System.out.println("maximum profit"+totalprofit);   
	    }
	}

