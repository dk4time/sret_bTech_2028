package com.greedy.com;
public class MinPlatform {
	    public static int main(String[]args){
	    	int[]arr= {1,3,4,5};
	    	int [] dep= {3,7,8,9};
	       int n=arr.length;
	       int maxplatform=1;
	       for(int i=1;i<n;i++) {
	    	   int platform=1;
           for(int j=i+1;j<n;j++) {
        	   if(arr[j]<=dep[i]) {
        		   platform++;
        	   }
        	   maxplatform=Math.max(maxplatform, platform);
           }
	       }
	       return maxplatform;
	    }
	}

