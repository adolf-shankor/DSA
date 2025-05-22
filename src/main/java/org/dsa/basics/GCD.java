package org.dsa.basics;
//GCD of Two Numbers
//You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.
//The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.
public class GCD {
    public static void main(String[] args) {
        int n1 = 12, n2 = 15;
        System.out.println(gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        if (n2 == 0)
            return n1;
        return gcd(n2, n1 % n2);
    }

//Iterative Solution
//    public static int gcd(int n1, int n2) {
//        while (n2 != 0) {
//            int temp = n2;
//            n2 = n1 % n2;
//            n1 = temp;
//        }
//        return n1;
//    }
}
