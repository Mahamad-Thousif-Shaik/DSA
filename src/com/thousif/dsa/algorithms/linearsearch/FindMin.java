package com.thousif.dsa.algorithms.linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {4,3,0,7,2,1};
        System.out.println(min(nums));
    }
    private static int min(int[] nums){
        int ans = nums[0];
        for(int num: nums){
            if(ans > num ){
                ans = num;
            }
        }
        return ans;
    }
}
