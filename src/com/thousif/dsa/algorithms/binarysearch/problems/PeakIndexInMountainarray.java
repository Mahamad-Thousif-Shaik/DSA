package com.thousif.dsa.algorithms.binarysearch.problems;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInMountainarray {
    public static void main(String[] args) {
        int[] nums = {0,5,12,7,4};
        System.out.println(findPeak(nums));
    }

//    private static int findPeak(int[] nums){
//        int start = 0;
//        int end = nums.length-1;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if((mid+1)>nums.length-1 || (mid-1)<0){
//                return mid;
//            }
//            if(nums[mid] > nums[mid+1] && nums[mid] >nums[mid-1]){
//                return nums[mid];
//            }
//            else if(nums[mid] < nums[mid+1]){
//                start = mid+1;
//            }
//            else{
//                end = mid-1;
//            }
//        }
//        return -1;
//    }
//
    //Alternative way

    private static int findPeak(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
