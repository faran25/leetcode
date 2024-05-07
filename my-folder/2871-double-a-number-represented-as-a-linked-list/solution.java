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
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head.next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head= reverse(head);
        ListNode first=head;
        int carry=0;
        while(head!=null)
        {
            int sum=carry+2*head.val;
            carry=sum/10;
            head.val=sum%10;
            if(head.next==null)
            {
                if(carry!=0)
                {
                    ListNode temp=new ListNode(carry);
                    head.next=temp;
                    break;
                }
                
            }
            head=head.next;
        }
        return reverse(first);

        
    }
}
