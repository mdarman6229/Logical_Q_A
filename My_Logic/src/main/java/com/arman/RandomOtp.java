package com.arman;

import java.util.Random;

//. Generate random number or Stirng   Java like OTP?
public class RandomOtp {
    public static void main(String[] args) {

        Random rn=new Random();
        String otp="";

//      Approach 1 : using for loop

        for(int i=0;i<6;i++){
            otp=otp+rn.nextInt(10);
        }
        System.out.println("Random otp : "+otp);

//      Approach 2 : using loop

        String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ0987654321";

        for(int i=0;i<6;i++){
            int index=rn.nextInt(s1.length());
            char ch=s1.charAt(index);
            otp=otp+ch;
        }
        System.out.println("OTP : "+otp);
    }
}
