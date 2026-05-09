package com.arman;
// find the duplicate elements inside the array
public class MoreThanDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,2,5,3,6,3,9,6,8,6};
        System.out.println("Duplicate element are : ");
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
//                if check the duplicate elements
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
//            if already printed or not
            boolean already=false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    already=true;
                    break;
                }
            }
            if(flag && !already){
                System.out.print(arr[i]+",");
            }

        }
    }
}
