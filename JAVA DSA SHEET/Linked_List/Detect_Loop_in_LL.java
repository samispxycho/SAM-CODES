package Linked_List;

class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
}

public class Detect_Loop_in_LL {

    static boolean detectLoop(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Node node1=new Node(3);
        Node node2=new Node(2);
        Node node3=new Node(0);
        Node node4=new Node(-4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;

        Node head=node1;

        System.out.println(Detect_Loop_in_LL.detectLoop(head));

    }
}
