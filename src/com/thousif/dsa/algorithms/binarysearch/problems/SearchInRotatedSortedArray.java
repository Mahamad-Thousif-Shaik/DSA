package com.thousif.dsa.algorithms.binarysearch.problems;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 5;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int pivot =  findPivot(nums, target, 0, nums.length-1);
        int findFirst = binarySearch(nums, target, pivot, nums.length-1);
        if(findFirst == -1){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return findFirst;
    }

    public static int findPivot(int[] nums, int target, int start, int end){
        if(end == 0 || nums[start] < nums[end]){
            return 0;
        }
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
