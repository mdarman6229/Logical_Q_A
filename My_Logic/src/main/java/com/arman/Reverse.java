package com.arman;

// 01. How do you reverse a string in Java?
public class Reverse {
    public static void main(String[] args) {

        String s1="My name is Md Arman";
        String rev="";

//      Approach 1 : using for Loop

        for(int i=s1.length()-1;i>=0;i--) {
            char ch=s1.charAt(i);

            rev=rev+ch;
        }
        System.out.println(rev);
//        Approach 2 : using for StringBuilder

        StringBuilder sb=new StringBuilder(s1);
        sb.reverse().toString();
        System.out.println(sb);
    }

}
