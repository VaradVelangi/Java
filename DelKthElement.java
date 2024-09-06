import javax.xml.crypto.Data;
import java.util.*;
class LL{
    Node head;
    class Node {

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void add(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
            return;
        }
        n1.next = head;
        head = n1;
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

}






public class DelKthElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        LL l1=new LL();
       l1.add(20);
        l1.print();

    }
}
