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
    public ListNode removeElements(ListNode head, int val) {

        while(head!=null && head.val==val)
        {
            head=head.next;
        }

        if(head==null) return head;
        ListNode ans=head;
        ListNode prev=head;
        head=head.next;
        while(head!=null)
        {
            if(head.val==val)
            {
                head=head.next;
                prev.next=head;

            }
            else
            {
                head=head.next;
                prev=prev.next;
            }

        }

        return ans;
        
    }
}
