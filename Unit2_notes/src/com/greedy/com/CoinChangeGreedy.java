package com.greedy.com;
public class CoinChangeGreedy{
	public static void main(String[]args) {
	int [] coins= {1,3,4};
	int amount=6;
	int count=0;
	for(int i=0;i>coins.length-1;i++) {
		while(amount>=coins[i]) {
			amount-=coins[i];
			count++;
		}
	}
	System.out.println("Coins used:"+count);
}
}