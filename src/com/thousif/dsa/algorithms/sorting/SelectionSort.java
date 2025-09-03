package com.thousif.dsa.algorithms.sorting;

import java.util.Arrays;

//Select the min/max element and put it at the right/left most in the array for each outer loop.

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7,6,5,4,3,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int minIdx = i;
            for(int j=i+1; j< nums.length; j++){
                if(nums[j] < nums[minIdx]){
                    minIdx = j;
                }
            }
            swap(nums, minIdx, i);
        }
    }

//    private static void sort(int[] nums){
//        for(int i=0; i<nums.length; i++){
//            int max = 0;
//            for(int j=0; j<nums.length-i; j++){
//                if(nums[max] < nums[j]){
//                    max = j;
//                }
//            }
//            swap(nums, max, nums.length-i-1);
//        }
//    }

    private static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
