package com.thousif.dsa.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }


    //swapping the adjacent elements
    //for each rotation biggest element comes(bubbles) to the right most index of the array
    private static void sort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            boolean swapped = false;
            for (int j=0; j<nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    private static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
