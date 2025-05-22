package org.dsa.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.
//A number which completely divides another number is called it's divisor.
//
public class DivisorsOfNumber {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int number = 125;
        Arrays.sort(divisors(number, result).toArray());
        System.out.println(result);
    }

    private static List<Integer> divisors(int number, List<Integer> result) {
        result.add(1);
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                result.add(i);
                result.add(number / i);
            }
        }
        return result;
    }

}
