/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode A) {
        ListNode head1=A;
        ListNode node=A;
        ListNode temp=A;
        while(node!=null && node.next!=null)
        {
            temp=head1;
            head1=head1.next;
            node=node.next.next;
        }
        temp.next=null;
        
        ListNode prev=null;
        ListNode curr=head1;
        ListNode next=head1;
        
        while(next!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head1=prev;
        
        while(A!=null)
        {
            if(head1.val!=A.val)
            return false;
            
            head1=head1.next;
            A=A.next;
        }
        return true;

    }
}
