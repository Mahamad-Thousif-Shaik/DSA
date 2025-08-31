package com.thousif.dsa.algorithms.binarysearch.problems;


//Ceiling -> The smallest number which is greater than or equal to the target in the array.
public class Ceiling {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9,13,19,25};
        int target = 14;
        System.out.println(findCeil(nums,target));
    }

    private static int findCeil(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        if(target > nums[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return start;
    }
}
