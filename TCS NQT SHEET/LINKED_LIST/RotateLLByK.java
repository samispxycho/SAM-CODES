package LINKED_LIST;

public class RotateLLByK {

    /*
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)return head;

        ListNode dummy=head;
        int len = 1;
        while(dummy.next!=null){
            len++;
            dummy=dummy.next;
        }

        dummy.next = head;

        k = k % len;
        k = len - k;

        while(k > 0){
            dummy = dummy.next;
            k--;
        }
        head = dummy.next;
        dummy.next = null;

        return head;
    }
    */

    public static void main(String[] args) {
        
    }
}
