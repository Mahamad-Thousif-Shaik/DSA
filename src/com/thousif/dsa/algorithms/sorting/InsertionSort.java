package com.thousif.dsa.algorithms.sorting;


//start from left most array compare the adjacent elements and sort the array of each rotation.
//4,3,2,1 -> 3,4,2,1 -> 2,3,4,1 -> 1,2,3,4

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {6,4,9,2,0,1,10};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            int j = i;
            while(j>0 && nums[j] < nums[j-1]){
                swap(nums, j, j-1);
                j--;
            }
        }
    }

    private static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

