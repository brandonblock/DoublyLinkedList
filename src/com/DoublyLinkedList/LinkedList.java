package com.DoublyLinkedList;

public class LinkedList {
    private static Node lastNode;
    private static Node firstNode;

    public void add(String item) {
        //Takes a string and links it to the next and previous strings.
        Node newNode = new Node();
        newNode.setItem(item);
        if (firstNode == null) {
            firstNode = newNode;
        }
        if (lastNode != null) {
            lastNode.setNext(newNode);
            newNode.setPrev(lastNode);
        }
        lastNode = newNode;
    }

    public void remove(Node node) {
        //Removes a node and links its next and previous nodes to each other.
        if (firstNode == node) {
            firstNode = node.getNext();
        } else if (lastNode == node) {
            lastNode = node.getPrev();
        }
        node.getNext().setPrev(node.getPrev());
        node.getPrev().setNext(node.getNext());
    }

    public void removeAll() {
        //Removes links between all nodes.
    }

    public void insertBefore(String inserted, Node before) {
        //Insert a Node before another Node and rectifies links between the surrounding nodes.
        Node newNode = new Node();
        newNode.setItem(inserted);
        before.getPrev().setNext(newNode);
        newNode.setNext(before);
        newNode.setPrev(before.getPrev());
        before.setPrev(newNode);
        if (before == firstNode) {
            firstNode = newNode;
        }
    }

    public void insertAfter(String inserted, Node after) {
        //Insert a Node after another Node and rectifies links between the surrounding nodes.
        Node newNode = new Node();
        newNode.setItem(inserted);
        after.getNext().setPrev(newNode);
        newNode.setNext(after.getNext());
        newNode.setPrev(after);
        after.setNext(newNode);
        if (after == lastNode) {
            lastNode = newNode;
        }
    }

    public String[][] toStringArray() {
        //Places linked nodes into an array.
        String[][] toStringArray = null; //placeholder
        return toStringArray;
    }

    public void fromStringArray() {
        //Takes items from an array and assigns them to linked nodes.
    }

    public void print() {
        //Prints the item of each node.
        Node printNode = new Node();
        printNode = firstNode;

        while (printNode != lastNode) {
            System.out.printf("%s \n", printNode.getItem());
            printNode = printNode.getNext();
        }
    }
}