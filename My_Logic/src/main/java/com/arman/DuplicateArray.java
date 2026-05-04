package com.arman;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Duplicate Elements in array of String?
public class DuplicateArray {
    public static void main(String[] args) {

        int arr[]={1,2,4,5,3,2,4,6,7,1};

        System.out.println("duplicate Elements inside the arrays :");

//        Approach 1 : using for loop
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){

            boolean flag=false;

            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.print(arr[i]+",");
            }
        }
//        Approach 2 : Using for set Avoid the duplicate elements
        Set<Integer> set=new HashSet<>();

        for(int duplicate : arr){
            if(set.add(duplicate)){
                System.out.println(set);
            }
        }

    }
}
