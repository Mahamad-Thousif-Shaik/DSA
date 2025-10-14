package com.thousif.dsa.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    private int[] sort(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        return mergeSort(arr,0, arr.length-1);
    }

    private int[] mergeSort(int[] arr, int start, int end){
        if(start == end){
            return new int[]{arr[start]};
        }

        int mid = start + (end - start)/2;

        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid+1, end);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] sortedArr = new int[left.length + right.length];
        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                sortedArr[k] = left[i];
                i++;
            }
            else{
                sortedArr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i< left.length){
            sortedArr[k] = left[i];
            i++;
            k++;
        }
        while(j< right.length){
            sortedArr[k] = right[j];
            j++;
            k++;
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        int[] arr = {0,-4,7,1,-1};
        MergeSort sorting = new MergeSort();
        System.out.println(Arrays.toString(sorting.sort(arr)));
    }
}
