package com.arman;

import java.util.HashMap;
import java.util.Map;

//How do you get distinct character send their count in a string in Java?
public class DistinctChar {
    public static void main(String[] args) {

        String s1="My name is md arman";

//        Approach 1 : Using for loop
        char arr[]=s1.toLowerCase().toCharArray();
        for(int i=0;i<arr.length;i++){

            if(arr[i]=='0' || arr[i]==' ')
                continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]='0';
                }
            }
            System.out.println(arr[i]+"  :  "+count);
        }

//        Approach 2 : Using for Map

        Map<Character,Integer> map=new HashMap<>();

        for(char ch : s1.toCharArray()){
            if(ch==' ')
                continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}
