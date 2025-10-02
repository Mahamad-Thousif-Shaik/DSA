package com.thousif.dsa.datastructures.linkedlist.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.add(6);
        list.add(4, 5);
        list.add(6, 7);
        list.print();
        list.printRev();
    }
}
