package com.greedy.com;
import java.util.Arrays;
public class ActivitySelection{
	public static void main(String[]args) {
	int [][]arr= {
			{1,3},//{starttime,endtime}
			{4,5},//{index-0,1}
			{6,7}
	};
	Arrays.sort(arr, (a,b) -> a[1] - b[1]);//comparing the end time of activities
    int lastend=arr[0][1];//assigning the end time of first activity
	int count=1;//is to count activities taking place
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i][0]>=lastend) {//if the start time is larger then we can start
			lastend=arr[i][1];//assigning the end time of recently visted activity
			count++;//collecting selected activities
		}
	}
	System.out.println("Selected activities"+count);
	
}}