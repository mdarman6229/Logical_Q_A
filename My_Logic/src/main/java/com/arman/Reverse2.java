package com.arman;

//.  Input :- String str="Hello EveryOne Hi Welcome to JTC";
//Output :- EveryOne Hello  welcome  Hi   JTC   to
public class Reverse2 {
    public static void main(String[] args) {
        String str="Hello EveryOne Hi Welcome to JTC";
        String arr[]=str.split(" ");
        String temp="";
        for(int i=0;i<=arr.length-1;i=i+2){
             temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }
        for(String s : arr){
            System.out.print(s+" ");
        }

    }
}
