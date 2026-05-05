package com.arman;
//Search Element in Array?
public class Search {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int search=30;
        boolean flag=false;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==search){
                flag=true;
                break;
            }
        }
        System.out.println(flag ?
                "Search element : "+search :
                "does not Search element : "+search
                );
    }

}
