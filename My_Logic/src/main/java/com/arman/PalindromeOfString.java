package com.arman;

//07. How do you check  whether a string is a palindrome in Java?
public class PalindromeOfString {
    public static void main(String[] args) {

        String s1="madam";
        String rev="";
        String org=s1;

        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            rev=rev+ch;
        }
        if(rev.equals(org)){
            System.out.println("it is palindrome :"+rev);
        }else {
            System.out.println("it is not palindrome :"+rev);
        }
    }
}
