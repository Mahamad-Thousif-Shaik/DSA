package com.thousif.dsa.algorithms.binarysearch.problems;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(count(nums));
    }

    private static int count(int[] nums){
        int len = nums.length;
        int pivot = findPivot(nums);
        return (len - pivot) % len;
    }

    private static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[end]){
                start = mid+1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            }
            else{
                end--;
            }
        }
        return start;
    }
}
