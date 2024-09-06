class plan{
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void create(int data){
        Node n1=new Node(data);
        size++;
        if(head==null){
            head=n1;
            return;
        }
        n1.next=head;
        head=n1;
    }

    public void print(){
        Node c1=head;
        while (c1!=null){
            System.out.print(c1.data+"->");
            c1=c1.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public void psize(){
        System.out.println("The size is:"+size);

    }

    public void check(){
        int mid=size/2;
        int i=0;
        Node trav=head;
        while (i<mid){
            trav=trav.next;
        }
        Node prev=trav;
        Node present=trav.next;
        while (trav!=null){
            Node forward=present.next;
            present.next=prev;
            prev=present;
            present=forward;
        }
        trav.next=null;
        Node tail=prev;

    }

}

public class Palendrom {
    public static void main(String[] args) {
        plan p1=new plan();
        p1.create(50);
        p1.create(40);
        p1.create(30);
        p1.create(20);
        p1.create(10);
        p1.print();
        p1.psize();
        p1.check();
        p1.print();


    }


}
