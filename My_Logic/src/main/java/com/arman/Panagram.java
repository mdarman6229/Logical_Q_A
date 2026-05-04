package com.arman;

//19. How to check given String is a panagram in java?
public class Panagram {
    public static void main(String[] args) {

        String s1="The quick brown fox jumps over the lazy dog";

        boolean b1[]=new boolean[26];

        for(int i=0;i<s1.length();i++){
            char ch=Character.toLowerCase(s1.charAt(i));

            if(ch>='a' && ch<='z'){
                b1[ch-'a']=true;
            }
        }
        boolean flag=true;

        for(int i=0;i<26;i++){
            if(!b1[i]){
                flag=false;
                break;
            }
        }

        System.out.println(flag ?
                "it is a Panagram" :
                "it is not a Panagram");
    }
}
