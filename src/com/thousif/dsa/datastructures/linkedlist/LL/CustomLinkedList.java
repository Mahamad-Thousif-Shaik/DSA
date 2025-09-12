package com.thousif.dsa.datastructures.linkedlist.LL;

import java.util.NoSuchElementException;

public class CustomLinkedList<T> {

    private Node head;
    private Node tail;

    private int size;

    private class Node {
        private T value;
        private Node next;

        Node(T value) {
            this.value = value;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        insertLast(value);
    }

    public void insertFirst(T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(T value) {
        Node newNode = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void add(int index, T value) {
        if (index == 0) {
            insertFirst(value);
        } else if (index == size) {
            insertLast(value);
        } else {
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("Index out of bound exception: " + index);
            } else {
                Node newNode = new Node(value);
                Node currentNode = head;
                int count = 1;
                while (count < index) {
                    currentNode = currentNode.next;
                    count++;
                }
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                size++;
            }
        }
    }

    public T deleteFirst(){
        if(head == null){
            throw new NoSuchElementException("List is empty");
        }
        else{
            T value = head.value;
            head = head.next;
            size--;
            return value;
        }
    }

    public T deleteLast(){
        if(tail == null){
            throw new NoSuchElementException("List is empty");
        }
        else{
            T value = tail.value;
            Node currentNode = head;
            for(int i=1; i<size-1; i++){
                currentNode = currentNode.next;
            }
            tail = currentNode;
            currentNode.next = null;
            size--;
            return value;
        }


    }


}


