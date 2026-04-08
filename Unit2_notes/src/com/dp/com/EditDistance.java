package com.dp.com;
import java.util.Scanner;
public class EditDistance {
	    // Function to find LPS length
	    public static int longestPalindromeSubseq(String s) {

	        int n = s.length();

	        // Create DP table
	        int[][] dp = new int[n][n];

	        // Base case: single characters
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = 1;
	        }

	        // Fill DP table
	        for (int i = n - 1; i >= 0; i--) {
	            for (int j = i + 1; j < n; j++) {

	                // If characters match
	                if (s.charAt(i) == s.charAt(j)) {
	                    dp[i][j] = 2 + dp[i + 1][j - 1];
	                }
	                // If not match
	                else {
	                    dp[i][j] = Math.max(
	                        dp[i + 1][j],   // skip left
	                        dp[i][j - 1]    // skip right
	                    );
	                }
	            }
	        }

	        return dp[0][n - 1];
	    }

	    // Main method (entry point)
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();

	        int result = longestPalindromeSubseq(s);

	        System.out.println("Longest Palindromic Subsequence Length: " + result);

	        sc.close();
	    }
	}
	

