package com.arman;

public class FloydsTriangle {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+j-1+" ");
            }
            System.out.println("");
        }

        System.out.println("================");

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+j-1+" ");
            }
            System.out.println("");
        }
    }
}
