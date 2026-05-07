package com.arman;

public class Pyramid {
    public static void main(String[] args) {
//      Approach 1: Increasing Pyramid Pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("------------------");
        // Approach 2: Decreasing/Inverted Pyramid Pattern

        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("==========================");

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
