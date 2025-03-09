package Linked_List;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

public class Add_Numbers {

    static Node addNumbers(Node l1,Node l2){
        Node dummy=new Node(0);
        Node current=dummy;

        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            current.next=new Node(sum%10);
            current=current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        Node l1_node1 = new Node(2);
        Node l1_node2 = new Node(4);
        Node l1_node3 = new Node(3);

        l1_node1.next = l1_node2;
        l1_node2.next = l1_node3;

        Node l2_node1 = new Node(5);
        Node l2_node2 = new Node(6);
        Node l2_node3 = new Node(4);

        l2_node1.next = l2_node2;
        l2_node2.next = l2_node3;

        Node l1_head1 = l1_node1;
        Node l2_head2 = l2_node1;

        Node result=Add_Numbers.addNumbers(l1_head1,l2_head2);

        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
