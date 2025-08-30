package com.thousif.dsa.algorithms.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {3,4,2,6,1,0,13,19};
        int target = 1;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    private static int search(int[] nums, int target){
        if(nums.length == 0){
            return -1;
        }
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
