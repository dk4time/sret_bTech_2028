package com.dp.com;
import java.util.Scanner;
public class LinearDp {
	    // Function to calculate number of ways
	    public static int climbStairs(int n) {

	        // Base cases
	        if (n <= 1) {
	            return 1;
	        }

	        int prev2 = 1; // ways to reach step 0
	        int prev1 = 1; // ways to reach step 1

	        // Loop from step 2 to n
	        for (int i = 2; i <= n; i++) {

	            int current = prev1 + prev2;

	            prev2 = prev1;
	            prev1 = current;
	        }

	        return prev1;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of steps: ");
	        int n = sc.nextInt();

	        int result = climbStairs(n);

	        System.out.println("Number of ways to climb: " + result);

	        sc.close();
	    }
	}
	

