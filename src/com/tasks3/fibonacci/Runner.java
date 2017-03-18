package com.tasks3.fibonacci;

/**
 * Created by yurko on 18.03.17.
 */
public class Runner {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        long time = System.nanoTime();
        System.out.println("fib(" + 100 + ")=" + fib.getNumber(50));
        System.out.println(System.nanoTime() - time);

        time = System.nanoTime();
        System.out.println("fib(" + 100 + ")=" + fib.getNumberRecur(50));
        System.out.println(System.nanoTime() - time
        );
    }
}
