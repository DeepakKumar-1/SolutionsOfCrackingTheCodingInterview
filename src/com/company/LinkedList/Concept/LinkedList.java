package com.company.LinkedList.Concept;



public class LinkedList {
    private Node head;
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        System.out.println("Insertion Successfully Done!!");
    }

    public void insertAtIndex(int val , int index){
        if(index == 0){
            insertAtFirst(val);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void insertAtEnd(int val){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // Create New Node
        Node node = new Node(val);
        temp.next = node;
        node.next = null;
    }

    public void deleteFirst(){
        head = head.next;
    }

    public void deleteLast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        Node ptr1 = head;
        Node ptr2 = head.next;
        for(int i=0; i<index-1; i++){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next = ptr2.next;
        ptr2.next = null;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node() {
        }
    }
}
