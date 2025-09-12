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
        list.insertLast(6);
        list.add(5, 5);
        System.out.println(list.deleteFirst());
        list.print();
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.deleteLast());
        list.print();
        System.out.println();
        System.out.println(list.size());
    }
}
