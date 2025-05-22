package org.dsa.basics;
////   TUF 7 .Count Digits
/// You are given an integer n. You need to return the number of digits in the number.
/// The number will have no leading zeroes, except when the number is 0 itself.
public class CountDigits {
    public static void main(String[] args) {
System.out.println(countDigit(123456));
    }
    public static int countDigit(int n) {
        int count=0;
        while(n>0){
            int remainder=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
}
