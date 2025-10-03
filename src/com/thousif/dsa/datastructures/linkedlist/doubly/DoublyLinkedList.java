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
        Node(Node prev, T value, Node next){
            this.prev = prev;
            this.value = value;
            this.next = next;
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

    public void printRev(){
        Node currentNode = tail;
        while(currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.prev;
        }
    }

    public void add(T value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void addFirst(T value) {
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

    public void add(int index, T value){
        checkPositionIndex(index);
        if(index == size){
            add(value);
        }
        else {
            linkBefore(value, getNode(index));
        }
    }

    public T delete(int index){
        checkElementIndex(index);
        Node currentNode = getNode(index);
        T element = currentNode.value;
        Node prevNode = currentNode.prev;
        Node nextNode = currentNode.next;

        if(prevNode == null){
            head  = nextNode;
        }else{
            prevNode.next = nextNode;
            currentNode.prev = null;
        }

        if(nextNode == null){
            tail = prevNode;
        }else{
            nextNode.prev = prevNode;
            currentNode.next = null;
        }
        currentNode.value = null;
        return element;
    }

    private void linkBefore(T value, Node nextNode){
        Node prevNode = nextNode.prev;
        Node newNode = new Node(prevNode, value, nextNode);
        nextNode.prev = newNode;
        if(prevNode == null){
            head = newNode;
        }
        else{
            prevNode.next = newNode;
        }
        size++;
    }

    private Node getNode(int index){
        if(index < (size >> 1)){ // divided by 2
            Node currentNode = head;
            for(int i=0; i<index; i++){
                currentNode = currentNode.next;
            }
            return currentNode;
        }
        else{
            Node currentNode = tail;
            for(int i=size-1; i>index; i--){
                currentNode = currentNode.prev;
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
