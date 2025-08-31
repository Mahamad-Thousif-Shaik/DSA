package com.thousif.dsa.algorithms.linearsearch.problems;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {0,12,345,2,6,7896,876516,-12};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            boolean isEven = findDigits(num);
            if(isEven){
                count++;
            }
        }
        return count;
    }

    //Alternative, only works with positive numbers
    private static boolean findDigitsAlt(int num) {
        return ((int)Math.log10(num) + 1)%2 ==0 ;
    }

    private static boolean findDigits(int num){
        if(num == 0){
            return false;
        }
        int digits = 0;
        while(num != 0){
            digits++;
            num /= 10;
        }
        if(digits %2 == 0){
            return true;
        }
        return false;
    }

}
