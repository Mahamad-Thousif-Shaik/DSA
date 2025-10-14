package com.thousif.dsa.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

    private int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start;
        int j = end;
        while(i < j){
            while(i < end && arr[i] < pivot){
                i++;
            }
            while(j > start && arr[j] >= pivot){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, end, i);
        return i;

    }

    private void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] =temp;
    }

    private void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    private int[] sort(int[] arr){
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 6, 2, -1, 5, 7, 9, 1, 3};
        QuickSort sorting = new QuickSort();
        System.out.println(Arrays.toString(sorting.sort(arr)));
    }
}
