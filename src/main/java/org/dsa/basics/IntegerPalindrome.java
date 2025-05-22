package org.dsa.basics;
////   LT 9 .Palindrome Number
/// //Given an integer x, return true if x is a palindrome, and false otherwise.
public class IntegerPalindrome {
    public static void main(String[] args) {
    System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int res=x;
        int reverse=0;
        while(x!=0){
            int remainder=x%10;
            reverse=reverse*10+remainder;
            x=x/10;
        }
        if(reverse==res)
            return true;
        return false;
    }
}
