package com.thousif.dsa.algorithms.binarysearch.problems;
//It is unsorted array and nums[i] !=nums[i+1], nums[-1] = -infinity
//Peak element -> local maxima
//https://leetcode.com/problems/find-peak-element/description/

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeak(nums));
    }

    private static int findPeak(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid  = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
