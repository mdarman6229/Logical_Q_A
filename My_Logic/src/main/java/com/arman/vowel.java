package com.arman;

//03. Write a Java program to check  if  a  vowel  is  present  in  a  string?
public class vowel {
    public static void main(String[] args) {

        String s1="Md Arman";
        boolean flag=false;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                flag=true;
                break;
            }
        }
        System.out.println(flag?"Vowel is present ":"Vowel is not present");

    }
}
