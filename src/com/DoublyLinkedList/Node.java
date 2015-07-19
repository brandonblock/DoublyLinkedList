package com.DoublyLinkedList;

/**
 * Created by brandon on 7/13/15.
 */
public class Node {
    private Node nextNode;
    private Node prevNode;
    private String item;

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setNext(Node next) {
        this.nextNode = next;
    }

    public Node getNext() {
        return nextNode;
    }

    public void setPrev(Node prev) {
        this.prevNode = prev;
    }

    public Node getPrev() {
        return prevNode;
    }
}