package com.linkedlist;

public class CreateLinkedList<T> {

    Node<T> head;

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }


    public static void main(String[] args) {
        CreateLinkedList<Integer> linkedList = new CreateLinkedList<>();
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);

        linkedList.display();
    }
}
