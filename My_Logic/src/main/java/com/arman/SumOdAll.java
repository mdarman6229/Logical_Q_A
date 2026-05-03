package com.arman;

//13. How do you get the sum of all elements in an integer array in Java?
public class SumOdAll {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.print("Sum of all element in an array : "+sum);

    }
}
