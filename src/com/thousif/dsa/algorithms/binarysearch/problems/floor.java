package com.thousif.dsa.algorithms.binarysearch.problems;


//Floor -> The largest number which is smaller than or equal to target.
public class floor {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9,13,19,25};
        int target = 10;
        System.out.println(findFloor(nums,target));
    }

    private static int findFloor(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        if(target < nums[start]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}
