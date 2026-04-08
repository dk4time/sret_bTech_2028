package com.greedy.com;
import java.util.Arrays;
public class CoinChangeDp{
    public static void main(String[] args) {
    	int[] coins = {1, 3, 4};
    	 int amount = 6;
    	int[]dp=new int[amount+1];
    	Arrays.fill(dp,amount+1);//filling the array with maximum value
    	for(int i=0;i<=amount;i++) {
    		for(int coin:coins) {
    			if(coin<=i) {
    				dp[i]=Math.min(dp[i], dp[i-coin]+1);//dp[3],dp[2]
    				//dp[4],dp[3]
    				//dp[5],dp[4](we are resusing the reamining coins)
    			}
    		}
    	}
    	 
     System.out.println("coins used"+dp[amount]);//coins used 
    }
}


