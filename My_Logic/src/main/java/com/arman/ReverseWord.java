package com.arman;

// Reverse all the word available in String using Java? like :- Vivek kumar = keviV ramuk(O/P)
public class ReverseWord {
    public static void main(String[] args) {
        String s1="Vivek Kumar";
        String arr[]=s1.split(" ");
        String rev="";

//      Approach 1 : using for loop
        for(int i=0;i<=arr.length-1;i++){
            String s2=arr[i];
            String temp = "";
            for(int j=s2.length()-1;j>=0;j--){
                char ch=s2.charAt(j);
                temp=temp+ch;
            }
            rev=rev+temp+" ";
        }
        System.out.println(rev.trim());

//        Approach 2 : using for method
        StringBuilder sb=new StringBuilder();

        for(String s: arr){
            sb.append(new StringBuilder(s).reverse()).append(" ");
        }
        System.out.println(sb.toString());
    }
}
