package com.greedy.com;

public class LargestSubsequence {

    public static String largestSubsequence(String s) {

        StringBuilder result = new StringBuilder();

        char max = 'a';

        for(char c : s.toCharArray()){
            if(c > max){
                max = c;
            }
        }

        for(char c : s.toCharArray()){
            if(c == max){
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(largestSubsequence("abacb"));

    }
}