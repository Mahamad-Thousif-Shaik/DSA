package com.thousif.dsa.datastructures.linkedlist.LL;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.insertFirst(0);
        list.print();
    }
}
