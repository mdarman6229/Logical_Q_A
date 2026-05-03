package com.arman;

// 4.Write a Java programto check  if the  given number is a prime number?
public class PrimeNumber {
    public static void main(String[] args) {

        int num=19;
        boolean flag=true;

        if(num<=1){
            flag=false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
        }
        System.out.println(flag ? "it is a palindrome : "+num : " it is a not a palindrome : "+num);

    }
}
