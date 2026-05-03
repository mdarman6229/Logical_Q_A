package com.arman;

//05. Write a Java program to print a Fibonacci sequence in Java?
public class FibonacciNumber {
    public static void main(String[] args) {

        int a=0,b=1;

        System.out.print("Fibonacci sequence number is : ");
        System.out.print(a+","+b);
        for(int i=1;i<=7;i++){
            int temp=a+b;
            a=b;
            b=temp;

            System.out.print(","+temp);
        }
    }

}
