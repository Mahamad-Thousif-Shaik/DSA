package com.thousif.dsa.algorithms.binarysearch.problems;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6,7,9,12,15};
        int target = 6;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target){
        int[] range = findRange(nums, target);
        return binarySearch(nums, target, range[0], range[1]);
    }

    // Ignore the array out of bound exception, since it is infinite array
    private static int[] findRange(int[] nums, int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            int temp = end;
            end = end + (2 * (temp-start +1));
            start = temp+1;
        }
        return new int[]{start, end};
    }

    private static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
