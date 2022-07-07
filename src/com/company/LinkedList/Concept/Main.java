package com.company.LinkedList.Concept;

public class Main {
    public static void main(String []args){
        LinkedList list = new LinkedList();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.traverse();
        list.insertAtIndex(5, 1);
        list.traverse();
        list.insertAtEnd(34);
        list.traverse();
        list.deleteFirst();
        list.traverse();
        list.deleteLast();
        list.traverse();
        list.deleteAtIndex(2);
        list.traverse();
    }
}
