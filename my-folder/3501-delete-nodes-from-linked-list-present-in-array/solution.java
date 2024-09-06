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
    public ListNode modifiedList(int[] nums, ListNode head) {
        /*Set<Integer> set = Arrays.stream(nums)
                                 .boxed()
                                 .collect(Collectors.toCollection(HashSet::new));*/
        HashSet<Integer> set = new HashSet<>(nums.length);
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        ListNode ans=head;
        while(set.contains(head.val))
        {
            head=head.next;
        }
        ans=head;
        ListNode prev=head;
        while(head!=null)
        {
            if(set.contains(head.val))
            {
                head=head.next;
                prev.next=head;
            }
            else
            {
                prev=head;
                head=head.next;
            }
        }
        return ans;
    }
}
