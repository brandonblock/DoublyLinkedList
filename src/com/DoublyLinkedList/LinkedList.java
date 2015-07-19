package com.DoublyLinkedList;

/**
 * Created by brandon on 7/13/15.
 */
public class LinkedList {
    private Node lastNode;
    private Node firstNode;

    public void add(String item) {
        //Takes a string and links it to the next and previous strings.
        Node newNode = new Node();
        newNode.item = item;
        if (this.firstNode == null) {
            this.firstNode = newNode;
        }
        if (this.lastNode != null) {
            this.lastNode.nextNode = newNode;
            newNode.prevNode = this.lastNode;
        }
        this.lastNode = newNode;
    }

    public void remove(Node node) {
        //Removes a node and links its next and previous nodes to each other.
        if (this.firstNode == node) {
            this.firstNode = node.nextNode;
        } else if (this.lastNode == node) {
            this.lastNode = node.prevNode;
        }
        node.nextNode.prevNode = node.prevNode;
        node.prevNode.nextNode = node.nextNode;
    }

    public void removeAll() {
        //Removes links between all nodes.
    }

    public void insertBefore(String inserted, Node before) {
        //Insert a Node before another Node and rectifies links between the surrounding nodes.
        Node newNode = new Node();
        newNode.item = inserted;
        before.prevNode.nextNode = newNode;
        newNode.nextNode = before;
        newNode.prevNode = before.prevNode;
        before.prevNode = newNode;
        if (before == firstNode) {
            firstNode = newNode;
        }
    }

    public void insertAfter(String inserted, Node after) {
        //Insert a Node after another Node and rectifies links between the surrounding nodes.
        Node newNode = new Node();
        newNode.item = inserted;
        after.nextNode.prevNode = newNode;
        newNode.nextNode = after.nextNode;
        newNode.prevNode = after;
        after.nextNode = newNode;
        if (after == lastNode) {
            lastNode = newNode;
        }
    }

    public String[][] toStringArray() {
        //Places linked nodes into an array.
        return toStringArray();
    }

    public void fromStringArray() {
        //Takes items from an array and assigns them to linked nodes.
    }

    public void print() {
        //
    }
}
