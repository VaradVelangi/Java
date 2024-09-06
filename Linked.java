import java.util.*;
class Link {
    Node head;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void AddFirst(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    public void AddLast(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
            return;
        }
        Node check = head;
        while (check.next != null) {
            check = check.next;
        }
        check.next = n1;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node check = head;
        while (check != null) {
            System.out.print(check.data + "->");
            check = check.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Link empty cannot delete");
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        size--;
        Node SecondLast = head;
        Node Last = head.next;
        while (Last.next != null) {
            Last = Last.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
    }


    public void Size() {
        System.out.println("The size of list is:" + size);
    }


    public void rev() {
        Node prev = head, present = head.next;
        while (present != null) {
            Node next2 = present.next;
            present.next = prev;
            //reverse
            prev = present;
            present = next2;
        }
        head.next=null;
        head=prev;
    }

}


public class Linked {
    public static void main(String[] args) {
        Link l1=new Link();
        l1.AddFirst(20);
        l1.AddFirst(10);
        l1.AddLast(30);
        l1.AddLast(40);
        l1.print();
        l1.Size();
        l1.deleteFirst();
        l1.print();
        l1.Size();
        l1.deleteLast();
        l1.print();
        l1.Size();
        l1.rev();
        l1.print();
    }
}
