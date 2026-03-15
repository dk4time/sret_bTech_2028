package com.greedy.com;
public class MinPlatform {
	    public static int main(String[]args){
	    	int[]arr= {1,3,4,5};
	    	int [] dep= {3,7,8,9};
	        int n = arr.length;
	        int maxPlatforms = 1;
	        for (int i = 0; i < n; i++) {
	            int platforms = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] <= dep[i]) {
	                    platforms++;
	                }
	            }
	            maxPlatforms = Math.max(maxPlatforms, platforms);
	        }
	        return maxPlatforms;
	    }
	}

