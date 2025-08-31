package com.thousif.dsa.algorithms.linearsearch;

import java.util.Arrays;

public class SearchIn2DArrray {
    public static void main(String[] args) {
        int[][] nums = {
                {4,5,2,8,16},
                {19,32,0,-1},
                {10,11,19,14,15}
        };
        int target = 4;
        System.out.println(Arrays.toString(search(nums, target)));
        System.out.println(max(nums));
        System.out.println(min(nums));
    }

    private static int[] search(int[][] nums, int target){
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(nums[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static int max(int[][] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(nums[i][j] > max){
                    max = nums[i][j];
                }
            }
        }
        return max;
    }

    private static int min(int[][] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(nums[i][j] < min){
                    min = nums[i][j];
                }
            }
        }
        return min;
    }

}
