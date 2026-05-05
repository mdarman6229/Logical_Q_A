package com.arman;

//how to remove special/junk character from the string in java?
public class RemoveJunk {
    public static void main(String[] args) {

        String s1="Ja#$va@1Dev9e%lo&pe!19r";

        char arr[]=s1.toLowerCase().toCharArray();
        String remove="";

//        Approach 1 : using for loop

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                remove=remove+arr[i];
            }
        }
        System.out.println("Remove All Special junk : "+remove);

//        Approach 2 : using for method
        String s2= s1.replaceAll("[^A-Za-z]","");
        System.out.println("Remove All Special junk : "+s2);
    }
}
