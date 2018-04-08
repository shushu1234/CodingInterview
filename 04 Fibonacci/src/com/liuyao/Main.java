package com.liuyao;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Fibonacci(4));
    }

    public static int Fibonacci(int n) {
        return (int) (Math.pow(2, -1 * n) * Math.pow(5, -0.5) * (Math.pow(1 + Math.pow(5, 0.5), n) - Math.pow(1 - Math.pow(5, 0.5), n)));
    }

    public static int Fibonacci2(int n) {
        int f = 0, g = 1;
        while (n-- > 0) {
            g += f;
            f = g - f;
        }
        return f;
    }
}
