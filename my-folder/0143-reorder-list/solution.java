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
    private ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
    public ListNode merge(ListNode head1, ListNode head2)
    {
        ListNode next2=head2;
        ListNode head=head1;
        ListNode next=head;
        ListNode prev=null;
        while(head1!=null)
        {
            prev=head2;
            next=head1.next;
            next2=head2.next;
            head1.next=head2;
            head2.next=next;
            head2=next2;
            head1=next;
        }
        if(head2!=null)
        {
            prev.next=head2;
        }
        return head;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return ;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        slow=reverse(slow);
        prev.next=slow;
        ListNode head2=prev.next;
        prev.next=null;
        head=merge(head, head2);
    }
}
