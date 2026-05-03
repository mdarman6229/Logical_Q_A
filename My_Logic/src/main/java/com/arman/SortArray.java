package com.arman;

import java.util.Arrays;

//09. How do you sort an array in Java?
public class SortArray {
    public static void main(String[] args) {
        int arr[]={1,10,9,15,18,20,3,5,30};

//        Approach 1 : Using for loop

        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a+",");
        }

        //        Approach 2 : Using for Arrays method

        Arrays.sort(arr);

        for(int s:arr){
            System.out.print(s+",");
        }
    }
}
