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
        if(list1==null) return list2;
        else if(list2==null) return list1;
        ListNode ans=list1;
        if(list1.val>list2.val)
        {
            ans=list2;
        }
        ListNode prev1=list1;
        ListNode prev2=list2;
        while(list1!=null && list2!=null)
        {
            prev1=list1;
            prev2=list2;
            if(list2.next!=null && list1.val>list2.val && list1.val>list2.next.val)
            {
               list2=list2.next;
            }
            else if(list1.val>list2.val)
            {
                ListNode temp=list2;
                list2=list2.next;
                temp.next=list1;
            }
            else if(list1.next!=null && list2.val>=list1.val && list2.val>=list1.next.val)
            {
               list1=list1.next;
            }
            else if(list2.val>=list1.val)
            {
                ListNode temp=list1;
                list1=list1.next;
                temp.next=list2;
            }
            
        }

        return ans;
        
    }
}
