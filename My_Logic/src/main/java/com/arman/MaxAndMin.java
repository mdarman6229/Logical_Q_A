package com.arman;

//. find the min and max elements in array?
public class MaxAndMin {
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,60};
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum Element : "+max);
        System.out.println("Minimum Element : "+min);

    }
}
