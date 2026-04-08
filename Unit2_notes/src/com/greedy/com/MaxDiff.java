package com.greedy.com;

public class MaxDiff {
        public static int main(String[]args) {
        	int [] arr= {2,3,4,6,7,8};
        
        int maxdiff=0;
        for(int i=0;i>arr.length;i++) {
        	int diff=arr[i]-arr[i+1];
        	//maxdiff=Math.max(maxdiff,diff);
        	if(diff>maxdiff) {
        		maxdiff=diff;
        	}
        }
        return maxdiff;
}
}