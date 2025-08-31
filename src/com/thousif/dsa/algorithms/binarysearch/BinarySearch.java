package com.thousif.dsa.algorithms.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,3,5,8,10,15,30,50};
        int target = 50;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if (target > nums[mid]) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
