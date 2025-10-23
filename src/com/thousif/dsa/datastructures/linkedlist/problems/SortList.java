package com.thousif.dsa.datastructures.linkedlist.problems;

//https://leetcode.com/problems/sort-list/

public class SortList {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

//    TLE -> O(n*2)
//    private static ListNode sort(ListNode currentNode) {
//        ListNode outer = currentNode;
//        while(outer != null){
//            ListNode inner = currentNode;
//            while(inner != null && inner.next != null){
//                if(inner.val > inner.next.val){
//                    swap(inner, inner.next);
//                }
//                inner = inner.next;
//            }
//            outer = outer.next;
//        }
//        return currentNode;
//    }
//
//    private static void swap(ListNode left, ListNode right){
//        int temp = left.val;
//        left.val = right.val;
//        right.val = temp;
//    }
    private static ListNode getMid(ListNode fakeHead){
        // When list length is even, slight modification
        ListNode fast = fakeHead.next;
        ListNode slow = fakeHead;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode sort(ListNode fakeHead){
        if(fakeHead == null || fakeHead.next == null){
            return fakeHead;
        }
        ListNode mid = getMid(fakeHead);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = sort(fakeHead);
        right = sort(right);

        return merge(left, right);
    }

    private static ListNode merge(ListNode leftNode, ListNode rightNode){
        ListNode ans = new ListNode(-1);
        ListNode result = ans;
        while(leftNode != null && rightNode != null){
            if(leftNode.val < rightNode.val){
                ans.next = leftNode;
                leftNode = leftNode.next;
            }
            else{
                ans.next = rightNode;
                rightNode = rightNode.next;
            }
            ans = ans.next;
        }
        if(leftNode != null){
            ans.next = leftNode;
        }
        else{
            ans.next = rightNode;
        }
        return result.next;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode result = sort(node);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

}
