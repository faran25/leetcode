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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=new ListNode(0);
        prev.next=head;
        ListNode ans=prev;
        ListNode first=head;
        ListNode second=head;
        ListNode third=head;
        while(prev.next!=null && prev.next.next!=null)
        {
            first=prev.next;
            second=first.next;
            third=second.next;

            prev.next=second;
            first.next=third;
            second.next=first;

            prev=first;
        }
        return ans.next;
    }
}
