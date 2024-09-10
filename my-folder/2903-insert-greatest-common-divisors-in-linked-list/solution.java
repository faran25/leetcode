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
    private int gcd(int a,int b)
    {
        if(a==0) return b;
        else if(b==0) return a;
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode ans=head;
        while(head.next!=null)
        {
            ListNode mid=new ListNode(gcd(head.val,head.next.val));
            mid.next=head.next;
            head.next=mid;
            head=mid.next;
        }
        return ans;
    }
}
