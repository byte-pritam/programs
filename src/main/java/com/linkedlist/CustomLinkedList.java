package com.linkedlist;

import java.util.LinkedList;

public class CustomLinkedList {

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public void add(int data){
        //Node temp = head;
        Node n = new Node(data);
        if(head == null){
            head = n;
            //head.next = n;
        }else{
           //Node temp =head;
            while(head.next != null){
                head = head.next;
            }
            head.next = n;


        }
    }

    public void printLinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

}

