package com.thousif.dsa.datastructures.linkedlist.LL;

public class CustomLinkedList<T> {

    private Node head;
    private Node tail;

    private int size;

    private class Node{
        private T value;
        private Node next;

        Node(T value){
            this.value = value;
        }
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public int size(){
        return size;
    }

    public void add(T value){
        insertLast(value);
    }

    public void insertFirst(T value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(T value){
        Node newNode = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

}


