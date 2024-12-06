package ru.mirea.it.java.work22;

public class LinkedStack<T> {
    private class Node {
        private final T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node head;

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void clear() {
        head = null;
    }

    public T pop() throws NotEnoughItems {
        if (head == null) { throw new NotEnoughItems(); }
        Node current = head;

        if (head.getNext() == null) {
            head = null;
            return current.getData();
        }

        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        Node last = current.getNext();
        current.setNext(null);
        return last.getData();
    }

    public void print() {
        if (head == null) { return; }
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean isOperable() {
        return head != null && head.getNext() != null;
    }
}
