package com.company;

public class Main {

    static class LinkedList {
        Node head;

        static class Node {
            String data;
            Node next;
            int id;

            Node(String task, int b) {
                data = task;
                next = null;
                id = b;
            }
        }
        public void push(String task, int b){
            Node newNode = new Node(task, b);
            newNode.next = head;
            head = newNode;
        }

        public void insertAfter (Node prevNode, String task, int b){
            if (prevNode == null){
                System.out.println("Node cant be null");
                return;
            }
            Node newNode = new Node(task, b);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        public void append(String task, int b){
            Node newNode = new Node(task, b);
            if ( head == null){
                head = new Node(task, b);
                return;
            }
            newNode.next = null;
            Node last = head;
            while(last.next != null)
                last = last.next;
            last.next = newNode;
            return;

        }

        public boolean search(Node head, int b){
            Node current = head;
            while (current != null){
                return false;
            }
            return false;
        }

        public void printList(){
            Node tnode = head;
            while (tnode != null)
            {
                System.out.print(tnode.data + "\n");
                tnode = tnode.next;
            }
        }

        public static void main(String[] args) {
            LinkedList questChain = new LinkedList();
            questChain.head = new Node("Find herbs", 1);
            Node second = new Node("deliver herbs",2);
            Node third = new Node("Make potion",3);
            Node fourth = new Node("Deliver potion", 4);
            Node fifth = new Node("protect village", 5);
            Node sixth = new Node("fight monster", 6);
            Node seventh = new Node("save girl",7);
            Node eighth = new Node("escort home", 8);
            Node ninth = new Node("Find info on dungeon",9 );
            Node tenth = new Node("Travel to dungeon", 10);
            Node eleventh = new Node("Explore dungeon",11);
            Node twelfth = new Node("Defeat dungeon boss", 12);
            Node thirteenth = new Node("Escape dungeon before collapse", 13);
            Node fourteenth = new Node("Report dungeon completion",14);
            Node sixteenth = new Node("Speak to king", 16);
            Node seventeenth = new Node("prepare for war",17);
            Node eighteenth = new Node("Defend castle",18);
            Node nineteenth = new Node("slay dragon",19);
            Node twenty = new Node("save princess",20);

            questChain.head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = sixth;
            sixth.next = seventh;
            seventh.next = eighth;
            eighth.next = ninth;
            ninth.next = tenth;
            tenth.next = eleventh;
            eleventh.next = twelfth;
            twelfth.next = thirteenth;
            thirteenth.next = fourteenth;
            fourteenth.next = sixteenth;
            sixteenth.next = seventeenth;
            seventeenth.next = eighteenth;
            eighteenth.next = nineteenth;
            nineteenth.next = twenty;

            if (questChain.search(questChain.head, 15))
                System.out.println("Yes");
            else
                System.out.println("No");

            questChain.printList();
            questChain.insertAfter(fourteenth.next,"Deliver message", 15);


            questChain.printList();
            }

        }

    }
