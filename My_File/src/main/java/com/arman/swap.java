package com.arman;

//02. How do you swap two number switch out using a third variable in Java?
public class swap {
    public static void main(String[] args) {
        int a=10,b=20;
//      Approach 1 : using manually
        a=a+b;
        b=a-b;
        a=a-b;

        //      Approach 2 : using for Ternary operator
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a = "+a+" , b = "+b);

    }
}
