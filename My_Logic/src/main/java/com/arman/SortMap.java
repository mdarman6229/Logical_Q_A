package com.arman;

import java.util.*;

//15. Write a Java program that sorts HashMap by value?
public class SortMap {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("Aman", 50);
        map.put("Ravi", 30);
        map.put("Sita", 40);
        map.put("John", 20);
        map.put("Neha", 60);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());

        Collections.sort(list,(a,b)->a.getValue().compareTo(b.getValue()));

        Map<String,Integer> result=new LinkedHashMap<>();

        for(Map.Entry<String,Integer> s :list){
            result.put(s.getKey(),s.getValue());
        }
        System.out.println(result);
    }
}
