package LINKED_LIST;

public class MergeTwoLL {

    /*
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)return l2;
        if(l2 == null)return l1;
        if(l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        ListNode res = l1;
        while(l1!=null && l2!=null){
            ListNode temporary = l1;
            while(l1 != null && l2.val > l1.val){
                temporary = l1;
                l1 = l1.next;
            }
            temporary.next = l2;

            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
    */

    public static void main(String[] args) {
        
    }
}
