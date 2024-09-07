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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int count=0;
        ListNode first=head;
        while(head!=null)
        {
            head=head.next;
            count++;
        }
        if(k==0 || k==count) return first;
        if(k>count) k=k%count;
        ListNode temp=first;
        count=0;
        while(count<k)
        {
            temp=temp.next;
            count++;
        }
        head=first;
        while(temp.next!=null)
        {
            temp=temp.next;
            head=head.next;
        }
        temp.next=first;
        first=head.next;
        head.next=null;
        
        //System.out.println(head.val+" "+temp.val);
        return first;
    }
}
