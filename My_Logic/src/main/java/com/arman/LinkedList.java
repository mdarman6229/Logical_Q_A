package com.arman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//How do you reverse a linkedlist in Java?
public class LinkedList {
    public static void main(String[] args) {
        List<Integer> list= new java.util.LinkedList<>();
        list.add(1);
        list.add(10);
        list.add(12);
        list.add(21);
        list.add(15);
        list.add(13);

        System.out.println("Before reverse : ");
        System.out.print(list+",");
        System.out.println("");

        Collections.reverse(list);

        System.out.println("after reverse : ");
        System.out.print(list+",");
    }
}
