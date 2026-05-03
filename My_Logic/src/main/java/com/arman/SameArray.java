package com.arman;

import java.util.Arrays;

//12. Write a Java program that checks if two arrays contain the same elements
public class SameArray {
    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5};
        int arr2[]={2,3,4,1,5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Both array are equals");
        }else{
            System.out.println("Both array are not equals");
        }
    }
}
