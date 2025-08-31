package com.thousif.dsa.algorithms.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {3,5,2,7,4,0,1};
        int target = 3;
        System.out.println(search(nums, target, 0, 4));
    }
    private static int search(int[] nums, int target, int start, int end){
        if(nums.length == 0){
            return -1;
        }
        for(int index=start; index<=end; index++){
            if(nums[index] == target){
                return index;
            }
        }
        return -1;
    }
}
