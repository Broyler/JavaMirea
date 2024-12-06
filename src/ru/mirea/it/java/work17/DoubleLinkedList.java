package ru.mirea.it.java.work17;

import java.util.regex.Pattern;

public class DoubleLinkedList {
    private Node head = null;

    public Node getHead() {
        return head;
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            head.next = head;
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        newNode.next = head;
        head.prev = newNode;
    }

    public void print() {
        if (head == null) { return; }
        Node current = head;
        System.out.print(current.data + " ");
        while (current.next != head) {
            current = current.next;
            System.out.print(current.data + " ");
        }
    }

    private boolean isSorted() {
        if (head == null || head.next == null) { return true; }
        Node current = head;
        while (current.next != null) {
            current = current.next;
            if (current.data < current.prev.data) { return false; }
        }
        return true;
    }

    public void sort() {
        if (head == null || head.next == null) { return; }
        this.head.prev.next = null;
        this.head.prev = null;

        while (!this.isSorted()) {
            Node current = head;
            Node prev = head;
            while (current.next != null) {
                current = current.next;
                if (current.data < prev.data) {
                    // swap
                    if (prev == head) {
                        // prev is head
                        current.prev = null;
                        if (current.next != null) {
                            // current isn't the last item
                            prev.next = current.next;
                            current.next.prev = prev;
                        }
                        current.next = prev;
                        prev.prev = current;
                        this.head = current;
                    } else {
                        prev.prev.next = current;
                        current.prev = prev.prev;
                        prev.next = current.next;
                        if (current.next != null) {
                            current.next.prev = prev;
                        }
                        prev.prev = current;
                        current.next = prev;
                    }
                    current = current.next;
                }
                prev = current;
            }
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = this.head;
        this.head.prev = last;
    }
}
