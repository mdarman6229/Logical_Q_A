package com.arman;

import java.util.Arrays;

//How to check given strings is Anagram in java?
public class Anagram {
    public static void main(String[] args) {

        String s1="Listen"; // eat : ate
        String s2="Silent";

        char arr1[]=s1.toLowerCase().toCharArray();
        char arr2[]=s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("it is an Anagram");
        }else {
            System.out.println("it is not an Anagram");
        }
    }
}
