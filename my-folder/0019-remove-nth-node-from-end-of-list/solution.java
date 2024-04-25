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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        n=count-n;
        if(n==0) return head.next;
        temp=head;
        count=0;
        while(temp!=null)
        {
            if(count==n-1)
            {
                ListNode curr=temp;
                temp=temp.next.next;
                curr.next=temp;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;

        
    }
}
