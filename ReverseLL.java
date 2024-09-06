import java.util.*;
class Rev{
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;

        Node(int data){
        this.data=data;
        Node next=null;
        }
    }

    public void create(int data){
        Node n1=new Node(data);
        size=size+1;
        if(head==null){
            head=n1;
            return;
        }
        n1.next=head;
        head=n1;
    }

    public void print(){
        Node ck=head;
        while (ck!=null){
            System.out.print(ck.data+"->");
            ck=ck.next;
        }
        System.out.print("NULL");
    }

    public void size(){
        System.out.println();
        System.out.println(size);
    }

    public void del(int n){
        Node prev=head;
        int i=1;
        if (n==size){
            System.out.println(head.next);
        }
        while (i<size-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }



}


public class ReverseLL {
    public static void main(String[] args) {
        Rev r1=new Rev();
        r1.create(50);
        r1.create(40);
        r1.create(30);
        r1.create(20);
        r1.create(10);
        r1.print();
        r1.size();
        r1.del(5);
        r1.print();
        r1.size();
    }
}
