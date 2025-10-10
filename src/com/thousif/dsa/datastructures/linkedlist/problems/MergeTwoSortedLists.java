package com.thousif.dsa.datastructures.linkedlist.problems;






public class MergeTwoSortedLists {

    //Definition for singly-linked list.
    static class ListNode1 {
        int val;
        ListNode1 next;

        ListNode1() {
        }

        ListNode1(int val) {
            this.val = val;
        }

        ListNode1(int val, ListNode1 next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
            ListNode1 result = new ListNode1(-1);
            ListNode1 ans = result;
            while(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    result.next = list1;
                    list1 = list1.next;
                }
                else{
                    result.next = list2;
                    list2 = list2.next;
                }
                result = result.next;
            }

            if(list1 != null){
                result.next = list1;
            }
            else{
                result.next = list2;
            }
            return ans.next;
        }
    }

    public static void main(String[] args) {
        ListNode1 list1 = new ListNode1(1, new ListNode1(2, new ListNode1(4)));
        ListNode1 list2 = new ListNode1(1, new ListNode1(3, new ListNode1(4)));
        Solution sol = new Solution();
        ListNode1 result = sol.mergeTwoLists(list1, list2);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}

