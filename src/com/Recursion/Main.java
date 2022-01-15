package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Q. Write a program to remove consecutive duplicate elements in an array.

       Input values
       10 10 30 30 40 50 50 50 9 45
       Output
       10 30 40 50 9 45
	 */
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {10, 10, 30, 30, 40, 50, 50, 50, 9, 45};
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                nums[i] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}