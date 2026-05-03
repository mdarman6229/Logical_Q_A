package com.arman;

//14. How do you find the second largest number in an array in Java?
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

//        Approach 1 : Using Array
        System.out.print("second Largest number : ");
        System.out.println(arr[arr.length - 2]);
//        Approach 2 : Using for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];

            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }

        }
        System.out.print("second Largest number : "+second);
    }
}
