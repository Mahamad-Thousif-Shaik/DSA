package com.thousif.dsa.algorithms.sorting.cyclesort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {5,3,6,2,1,4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums){
        int i = 0;
        while(i< nums.length){
            if(nums[i] != i+1){
                swap(nums, i, nums[i]-1);
            }
            else{
                i++;
            }
        }
//        for(int i=0; i<nums.length; i++){
//            while(nums[i] != i+1){
//                swap(nums, i, nums[i]-1);
//            }
//        }
    }

    private static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
