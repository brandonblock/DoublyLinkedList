package com.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList linkedlist = new LinkedList();

        System.out.println("First we will add five nodes to the linked list and print its contents");

        linkedlist.add("one");
        linkedlist.add("two");
        linkedlist.add("three");
        linkedlist.add("four");
        linkedlist.add("five");
        linkedlist.print();

        System.out.println("Next we will remove one of the nodes and print the contents of the linkedlist");

        linkedlist.remove();
        linkedlist.print();

        System.out.println("Now we will add the nodes to an array and print its contents.");

        linkedlist.toStringArray();
        System.out.println(); //print the stringArray

        System.out.println("Finally, we remove links from the nodes, repopulate the linkedlist with nodes from our array and print it out one last time");

        linkedlist.removeAll();
        linkedlist.fromStringArray();
        linkedlist.print();
    }
}
