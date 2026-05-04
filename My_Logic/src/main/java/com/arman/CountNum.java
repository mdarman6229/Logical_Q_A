package com.arman;

//count digit from given number
public class CountNum {
    public static void main(String[] args) {

        int num=12343211;
        int count=0;
        while(num>0){
            int rem=num%10;
            count++;
            num=num/10;
        }
        System.out.println("All digit of number : "+count);
    }
}
