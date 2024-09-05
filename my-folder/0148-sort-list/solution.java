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
    public ListNode merge(ListNode list1, ListNode list2) {
        
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
    public ListNode sort(ListNode h)
    {
        // Base case : if head is null
        if (h == null || h.next == null) {
            return h;
        }
 
        // get the middle of the list
        ListNode middle = getMiddle(h);
        ListNode nextofmiddle = middle.next;
 
        // set the next of middle node to null
        middle.next = null;
 
        // Apply mergeSort on left list
        ListNode left = sort(h);
 
        // Apply mergeSort on right list
        ListNode right = sort(nextofmiddle);
 
        // Merge the left and right lists
        return merge(left, right);
        //return sortedlist;
    }
    public ListNode getMiddle(ListNode head)
    {
        if (head == null)
            return head;
 
        ListNode slow = head, fast = head;
 
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        return sort(head);
    }
}
