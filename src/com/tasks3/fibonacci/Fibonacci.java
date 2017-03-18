package com.tasks3.fibonacci;

public class Fibonacci {
    int[] fibonacciNumbers;
    int counter = 0;

    public long getNumber(int position){
        fibonacciNumbers = new int [position];

        for (int i = 0; i < position ; i++) {
            if (i > 1)
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
            else
                fibonacciNumbers[i] = 1;
        }

       return fibonacciNumbers[position-1];
    }

    public long getNumberRecur (int position) {
        return fib(position);
    }

    private int fib(int n) {
        if (n > 2) {
            return fib(n - 1 ) + fib(n-2);
        }
        else
            return 1;
    }
}
