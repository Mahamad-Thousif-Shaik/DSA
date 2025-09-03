package com.thousif.dsa.algorithms.binarysearch.problems;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class SearchInRotatedSortedArrayDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        boolean ans = binarySearch(nums, target, pivot, nums.length-1);
        if(!ans){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return ans;
    }

    private static boolean binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return true;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }

    private static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[end]){
                start = mid+1;
            }
            else if(nums[mid] < nums[end]){
                end = mid;
            }
            else if(nums[mid] == nums[end]){
                if(nums[end-1] > nums[end]){
                    return end;
                }
                end--;
            }
        }
        return start;
    }
}
