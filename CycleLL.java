class List{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void cycle(){
        Node slow=head;
        Node fast=head;
        if(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                System.out.println("Linked is a cycle");
            }
        }





    }

}



public class CycleLL {
    public static void main(String[] args) {

    }
}
