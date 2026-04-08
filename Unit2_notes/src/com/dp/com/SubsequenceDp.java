package com.dp.com;

import java.util.Scanner;

public class SubsequenceDp{

    // Function to find LCS length
    public static int lcs(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];

        // Fill DP table
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String text1 = sc.nextLine();

        System.out.println("Enter second string:");
        String text2 = sc.nextLine();

        int result = lcs(text1, text2);

        System.out.println("LCS Length = " + result);

        sc.close();
    }
}