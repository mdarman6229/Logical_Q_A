package com.arman;

public class TableTriangle {
    public static void main(String[] args) {

//      Approach 1: Increasing Right Triangle Pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("------------------");
//      Approach 2: Decreasing/Inverted Right Triangle Pattern
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
