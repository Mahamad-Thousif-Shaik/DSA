package com.thousif.dsa.datastructures.linkedlist.circular;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        System.out.println(list.delete(3));
        list.print();
    }
}
