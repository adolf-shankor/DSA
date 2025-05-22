package org.dsa.basics;
//
 // LT 125. Valid Palindrome
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String res=sb.toString();
        System.out.print(res);
        return isPalindromeStringRecursive(res);

    }

    public static boolean isPalindromeString(String result){
        int low=0;int high=result.length()-1;

        while(low<high){
            if(result.charAt(low)!=result.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    public static boolean isPalindromeStringRecursive(String result){
        int low=0;int high=result.length()-1;

        while(low<high){
            if(result.charAt(low)!=result.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
