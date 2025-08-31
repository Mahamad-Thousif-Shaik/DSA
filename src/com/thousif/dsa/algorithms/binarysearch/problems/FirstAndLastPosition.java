package com.thousif.dsa.algorithms.binarysearch.problems;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10,10};
        int target = 10;
        System.out.println(Arrays.toString(SearchInRange(nums, target)));
    }

    private static int[] SearchInRange(int[] nums, int target){
        int start = 0;
        int end = nums.length;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                int low = findRange(nums, mid, true);
                int high = findRange(nums, mid, false);
                return new int[]{low,high};
            }
        }
        return new int[]{-1,-1};
    }

    private static int findRange(int[] nums, int target, boolean low){
        if(low){
            for(int i=target; i>=0; i--){
                if(nums[i] != nums[target]){
                    return i+1;
                }
            }
            return 0;
        }
        else{
            for(int i=target; i<nums.length; i++){
                if(nums[i] != nums[target]){
                    return i-1;
                }
            }
            return nums.length-1;
        }
    }
}

//Alternative way
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//
//        int[] ans = {-1, -1};
//        ans[0] = search(nums, target, true);
//        if(ans[0] != -1){
//            ans[1] = search(nums, target, false);
//        }
//
//        return ans;
//
//    }
//    private int search(int[] nums, int target, boolean findFirstIndex){
//        int start = 0;
//        int end = nums.length - 1;
//        int ans = -1;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(target < nums[mid]){
//                end = mid - 1;
//            }
//            else if(target > nums[mid]){
//                start = mid + 1;
//            }
//            else{
//                ans = mid;
//                if(findFirstIndex){
//                    end = mid -1;
//                }
//                else{
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//    }
//}
