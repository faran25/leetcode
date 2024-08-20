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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode ans=new ListNode(-1);
        ListNode curr=ans;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                curr.next=list1;
                list1=list1.next;
            }else
            {
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        if(list1==null)
        {
            curr.next=list2;
        }else
        {
            curr.next=list1;
        }
        return ans.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode ans=lists[0];

        for(int i=1;i<lists.length;i++)
        {
            ans=mergeTwoLists(ans,lists[i]);
        }
        return ans;
    }
}
