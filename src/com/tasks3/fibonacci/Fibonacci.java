package com.tasks3.fibonacci;

public class Fibonacci {
    int[] fibonacciNumbers;

    public long getNumberDynamic(int position){
        fibonacciNumbers = new int [position];

        for (int i = 0; i < position ; i++) {
            if (i > 1)
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
            else
                fibonacciNumbers[i] = 1;
        }

       return fibonacciNumbers[position-1];
    }

    public int getNumber(int position) {
        if (position > 2)
            return getNumber(position - 1 ) + getNumber(position-2);
        else
            return 1;
    }


}
