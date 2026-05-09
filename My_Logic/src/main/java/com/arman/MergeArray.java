package com.arman;

// merge and remove the duplicate element an arrays
public class MergeArray {
    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5,6};
        int arr2[]={5,6,7,8,9,10};

        int result[]=new int[arr1.length+ arr2.length];
        int index=0;
        for(int i=0;i< arr1.length;i++){
            result[index++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            result[index++]=arr2[i];
        }
//        remove the duplicate elements an array
        for(int i=0;i< result.length;i++){
            boolean flag=false;
            for(int j=i+1;j< result.length;j++){
                if(result[i]==result[j]){
                    flag=true;
                    break;

                }
            }
            if(!flag){
                System.out.print(result[i]+",");
            }
        }
    }
}
