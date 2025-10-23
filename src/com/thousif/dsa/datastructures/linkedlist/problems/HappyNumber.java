package com.thousif.dsa.datastructures.linkedlist.problems;

//https://leetcode.com/problems/happy-number/description/
public class HappyNumber {


//    public static boolean isHappy(int n) {
//        int sum = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        while (sum != 1) {
//            sum = 0;
//            while (n > 0) {
//                int rem = n % 10;
//                sum += (rem * rem);
//                n /= 10;
//            }
//            if (list.contains(sum)) {
//                return false;
//            }
//            list.add(sum);
//            n = sum;
//        }
//        return true;
//    }

    public static  boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        }
        return  false;
    }
    private static int square(int n){
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum += (rem*rem);
            n /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
