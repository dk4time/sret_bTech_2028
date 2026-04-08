package com.dp.com;

class Fib2 {

    static int fib(int n) {

        if(n <= 1)
            return n;

        int a = 0;
        int b = 1;

        for(int i = 2; i <= n; i++) {

            int c = a + b;

            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String args[]) {

        int n = 6;

        System.out.println(fib(n));
    }
}