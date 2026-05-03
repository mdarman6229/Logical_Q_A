package com.arman;
//08. How do you remove spaces from a string in  Java?
public class RemoveSpace {
    public static void main(String[] args) {
        String s1="  Md Arman Warshi  ";
        String sum="";
//        Approach 1 : using for loop
        for(int i=0;i<=s1.length()-1;i++){
            char ch=s1.charAt(i);

            if(ch!=' '){
             sum=sum+ch;
            }
        }
        System.out.print("Remove white space : "+sum);

//        Approach 2 : Using for build in method
        String s2=s1.replaceAll(" ","").toString();
        System.out.println("Remove white space : "+s2);


    }
}
