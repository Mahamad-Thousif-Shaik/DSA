package com.thousif.dsa.datastructures.linkedlist.circular;

public class CircularLinkedList<T> {

    Node head;
    Node tail;
    int size;

    private class Node{
        Node next;
        T value;
        Node(T value){
            this.value = value;
        }
        Node(T value, Node next){
            this.value = value;
            this.next = next;
        }
    }


    public void add(T value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = head;
            head.next = tail;
        }else{
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    public T delete(int index){
        if(head == null){
            throw new NullPointerException("List is empty");
        }
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Provide the correct index: " + index);
        }
        Node prevNode = getNode(index-1);
        T deleted = prevNode.next.value;
        if(prevNode.next == tail){
            prevNode.next = head;
        } else if (prevNode == tail) {
            prevNode.next = head.next;
            head = prevNode.next;
        } else{
            prevNode.next = prevNode.next.next;
        }
        size--;
        return deleted;
    }

    public void print(){
        Node currentNode = head;
        do{
            System.out.print(currentNode.value+" ");
            currentNode = currentNode.next;
        }while(currentNode != head);
        System.out.println();
    }

    private Node getNode(int index){
        Node currentNode = head;
        for(int i=0; i<index; i++){
            currentNode = currentNode.next;
        }
        return currentNode;
    }




}
