package com.thousif.dsa.datastructures.linkedlist.problems;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/


public class RemoveSortedList {

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


    private ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if (node == null) {
            return head;
        }
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2)));
        RemoveSortedList rem = new RemoveSortedList();
    }
}

