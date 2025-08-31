package com.thousif.dsa.algorithms.binarysearch.problems;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','g','j','k','l','m'};
        char target = 'm';
        System.out.println(findCeil(letters, target));
    }

    private static char findCeil(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < letters[mid]) {
                end = mid-1;
            }//No need of checking the mid , since we need greater than target.z
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
