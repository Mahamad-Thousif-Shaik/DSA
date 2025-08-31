package com.thousif.dsa.algorithms.binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {50,30,25,19,10,9,4,1};
        int target = 10;
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
            else if(target > nums[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
