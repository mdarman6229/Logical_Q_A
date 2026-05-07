package com.arman;
//Find Middle Element of Array
public class Middle {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};

        if(arr.length%2==0){
            int mid1=arr.length/2-1;
            int mid2=arr.length/2;

            System.out.println("Middle Elements of an Arrays : "+arr[mid1]+"  "+arr[mid2]);
        }else{
            int mid=arr.length/2;
            System.out.println("Middle Elements ao an arrays : "+arr[mid]);
        }
    }
}
