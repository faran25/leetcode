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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans= new ListNode[k];
        if(head==null) return ans;
        int count=0;
        ListNode first=head;
        while(head!=null)
        {
            head=head.next;
            count++;
        }
        int max=count/k;
        int rem=count%k;
        
        head=first;
        //ans[0]=head;
        ListNode prev=head;
        for(int i=0;i<rem;i++)
        {
            ans[i]=head;
            for(int j=0;j<max+1;j++)
            {
                prev=head;
                head=head.next;
            }
            prev.next=null;
        }

        for(int i=rem;i<k;i++)
        {
            ans[i]=head;
            for(int j=0;j<max;j++)
            {
                prev=head;
                head=head.next;
            }
            prev.next=null;
        }
        return ans;

    }
}
