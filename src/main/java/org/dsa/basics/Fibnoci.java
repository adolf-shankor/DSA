package org.dsa.basics;
//509. Fibonacci Number
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
//Given n, calculate F(n).
//
public class Fibnoci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
        String s=new String("sdfg");
    }
    public static int fib(int n) {
        if(n==1 || n==0)
            return n;

        return fib(n-1)+fib(n-2);
    }

}
