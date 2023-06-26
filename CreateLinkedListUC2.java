package com.linkedlist;



   public class CreateLinkedListUC2<T> {
        Node<T> head;
      static class  Node<T> {
           T data;
           Node<T> next;

           Node(T data) {
               this.data = data;
               this.next = null;
           }
       }

        void insert(T data) {
            Node<T> newNode = new Node<>(data);

            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
        }

        void display() {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }



        public static void main(String[] args) {
            CreateLinkedListUC2<Integer> myList = new CreateLinkedListUC2<>();

            // Insert values into the linked list
            myList.insert(70);
            myList.insert(30);
            myList.insert(56);

            // Display the linked list
            myList.display();
        }
    }

