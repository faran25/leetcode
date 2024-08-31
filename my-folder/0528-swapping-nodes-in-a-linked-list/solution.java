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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode second=head;
        ListNode ans=head;
        int i=0;
        while(i<k-1)
        {
            head=head.next;
            i++;
        }
        first=head;
        second=ans;
        head=head.next;
        while(head!=null)
        {
            head=head.next;
            second=second.next;
        }
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        return ans;
    }
}
