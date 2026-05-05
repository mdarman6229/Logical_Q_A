package com.arman;
//find missing number from the array
public class Missing {
    public static void main(String[] args) {
        
        int arr[]={1,2,4,5,6};
        int n=6;
        int sum1=n*(n+1)/2,sum2=0;

        for(int i=0;i<arr.length;i++){
            sum2=sum2+arr[i];
        }
        int missing=sum1-sum2;

        System.out.println("Missing Element are : "+missing);
    }
}
