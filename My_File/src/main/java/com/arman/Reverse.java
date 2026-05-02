package com.arman;

// 01. How do you reverse a string in Java?
public class Reverse {
    public static void main(String[] args) {

        String s1="My name is Md Arman";
        String rev="";
        for(int i=s1.length()-1;i>=0;i--) {
            char ch=s1.charAt(i);

            rev=rev+ch;
        }
        System.out.println(rev);
    }

}
