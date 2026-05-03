package com.arman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//06. How do you check if a list of integers contains only odd numbers in Java?
public class OddNumber {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,7,9);
        boolean flag=true;
        for(int odd: list){
            if(odd%2==0){
                flag=false;
                break;
            }
        }
        System.out.println(flag? "All numbers are odd"
                : "List contains even numbers");

    }
}
