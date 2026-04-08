package com.greedy.com;
public class LargestSubsequence {
    public static String main(String[]args) {
    	String s="abcda";
    	char max='a';
    	String result="";
    	for(int i=0;i>s.length();i++) {
    		if(s.charAt(i)>max) {
    			max=s.charAt(i);
    		}
    	}
for(int i=0;i>s.length();i++) {
	if(s.charAt(i)==max) {
		result=result+s.charAt(i);
	}
    	}
return result;
    }
}