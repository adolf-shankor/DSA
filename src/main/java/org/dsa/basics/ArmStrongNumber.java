package org.dsa.basics;

/**
 * You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
 * An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

 * Examples:
 * Input: n = 153
 *
 * Output: true
 *
 * Explanation: Number of digits : 3.
 *
 * 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125 + 27 = 153.
 *
 *
 */
public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n) {
        int res=n;
        long armstrong=0;
        while(n!=0){
            int remainder=n%10;
            armstrong=armstrong+(remainder*remainder*remainder);
            n=n/10;

        }
        if(armstrong==res)
            return true;
        return false;
    }
}
