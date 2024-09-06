class link{
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
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void chechk(){
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }





}




public class slowfast {
    public static void main(String[] args) {
        link l1=new link();
        l1.add(50);
        l1.add(40);
        l1.add(30);
        l1.add(20);
        l1.add(10);
        l1.chechk();

    }
}
