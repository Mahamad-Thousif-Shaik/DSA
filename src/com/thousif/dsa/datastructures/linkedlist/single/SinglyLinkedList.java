package com.thousif.dsa.datastructures.linkedlist.single;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {

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
        System.out.println();
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
        checkElementIndex(index);
        if (index == 0) {
            insertFirst(value);
        } else if (index == size) {
            insertLast(value);
        } else {
            checkPositionIndex(index);

            Node currentNode = getNode(index-1);
            Node newNode = new Node(value);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
    }

    //Insert using recursion
    //Assuming size is not provided
    public void insertRec(int index, T value){
        Node newNode = new Node(value);
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prevNode = helperRec(index-1, head);
        if(prevNode.next == null){
            prevNode.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    private Node helperRec(int index, Node currentNode){
        if(index == 0){
            return currentNode;
        }
        return helperRec(index-1, currentNode.next);
    }

    public T deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else {
            T value = head.value;
            head = head.next;
            size--;
            return value;
        }
    }

    public T deleteLast() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty");
        } else {
            T value = tail.value;
            Node currentNode = getNode(size-2);
            tail = currentNode;
            currentNode.next = null;
            size--;
            return value;
        }
    }

    public T delete(int index) {
        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        } else {
            Node prevNode = getNode(index - 1);
            T deletedValue = prevNode.next.value;
            prevNode.next = prevNode.next.next;
            size--;
            return deletedValue;
        }
    }

    private Node getNode(int index) {
        checkElementIndex(index);
        if (index == size) {
            return tail;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode;
        }
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + "index=" + index + "size=" + size);
        }
    }

    private void checkPositionIndex(int index){
        if(!isPositionIndex(index)){
            throw new IndexOutOfBoundsException("Index is out of bounds: " + "index=" + index + "size=" + size);
        }
    }

    /**
     * Tells if the argument is the index of an existing element.
     */
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    /**
     * Tells if the argument is the index of a valid position for an iterator or an add operation.
     */
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

}


