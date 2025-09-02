package com.thousif.dsa.algorithms.binarysearch.problems;
//I copied the solution directly from leetcode
//Since it contains some interface and implemented classes, I haven't run the solution in IDE.
//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;

    }
}

  // This is MountainArray's API interface.
  // You should not implement it, or speculate about its implementation
  interface MountainArray {
      public int get(int index);

      public int length();
  }

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        int peak = findPeak(target, mountainArr);
        int ans = findTarget(target, mountainArr, start, peak);
        if(ans != -1){
            return ans;
        }
        return findTarget(target, mountainArr, peak, end);

    }

    private int findTarget(int target, MountainArray mountainArr, int start, int end){
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            else if(target < mountainArr.get(mid)){
                if(isAsc){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }

            }
            else{
                if(isAsc){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }

            }
        }
        return -1;
    }

    private int findPeak(int target, MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length()-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}