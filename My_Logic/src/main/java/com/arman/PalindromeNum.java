package com.arman;
//How do you check whether a integer number is a palindrome in Java?
public class PalindromeNum {
    public static void main(String[] args) {
        int num=121;
        int org=num,rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev==org ?
                "it is a palindrome "+rev :
                "it is a not palindrome : "+rev
        );
    }
}
