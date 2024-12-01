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
    public ListNode add(ListNode l1, ListNode l2, int carry)
    {
        if(l1==null && l2==null && carry == 1) 
        {
            return new ListNode(carry);
        }
        else if(l1==null && l2==null && carry == 0) 
        {
            return null;
        }
        else if(l1==null) {
            ListNode node = new ListNode((l2.val+carry) % 10);
            node.next = add(l1, l2.next, (l2.val+carry)/10);
            return node;
        }
        else if(l2==null) {
            ListNode node = new ListNode((l1.val+carry) % 10);
            node.next = add(l1.next, l2, (l1.val+carry)/10);
            return node;
        }

        int sum = l1.val + l2.val + carry;
        if (sum >= 10)
            carry =1;
        else carry=0;

        ListNode newNode = new ListNode(sum % 10);
        newNode.next = add(l1.next, l2.next, carry);
        return newNode;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return add(l1,l2,0);
    }
}
