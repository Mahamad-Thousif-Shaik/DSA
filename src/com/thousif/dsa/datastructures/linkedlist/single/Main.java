package com.thousif.dsa.datastructures.linkedlist.single;

public class Main {
    public static void main(String[] args) {
        
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.insertFirst(0);
        list.insertLast(6);
        list.add(5, 5);
        System.out.println(list.deleteFirst());
        list.print();
        System.out.println(list.size());
        System.out.println(list.deleteLast());
        list.print();
        System.out.println(list.size());
        System.out.println(list.delete(4));
        list.print();
        System.out.println(list.size());
    }
}
