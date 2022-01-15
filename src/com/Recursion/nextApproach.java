package com.Recursion;
import java.util.*;
public class nextApproach {
    public static void main(String[] args) {
        /*Write a program to remove consecutive duplicate elements in an array.

                Input values
        10 10 30 30 40 50 50 50 9 45
        Output
        10 30 40 50 9 45
         */
        int[] arr = {10, 10, 30, 30, 40, 50, 50, 50, 9, 45};
        int[] temp = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j] = arr[i];
                j++;
            }
        }
        int temp1 = arr[arr.length-1];
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

    }
}
