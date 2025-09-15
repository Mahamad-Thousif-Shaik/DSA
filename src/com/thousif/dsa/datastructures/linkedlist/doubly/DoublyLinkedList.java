package com.thousif.dsa.datastructures.linkedlist.doubly;

public class DoublyLinkedList<T> {

    private Node head;
    private Node tail;
    public int size;

    private class Node {
        T value;
        Node prev;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    public void print(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void insertFirst(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }



}
