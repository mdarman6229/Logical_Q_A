package com.arman;

//find the largest number out of three var?
public class LargestNum {
    public static void main(String[] args) {
        int a=10,b=30,c=20;
        if(a>b && a>c){
            System.out.println("a is largest number : "+a);
        }else if(b>a && b>c) {
            System.out.println("b is largest number : "+b);
        }else if(c>b && c>a) {
            System.out.println("c is largest number : " + c);
        }else{
            System.out.println("All are equals");
        }
    }
}
