package com.thousif.dsa.algorithms.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Thousif";
        char target = 'o';
        System.out.println(search(str, target));
    }

    private static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(char c: str.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }
}
