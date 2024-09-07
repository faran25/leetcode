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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean check(ListNode head, TreeNode root)
    {
        if(head==null) return true;
        if(root==null) return false;
        if(head.val==root.val)
        return check(head.next,root.left) || check(head.next,root.right);
        return false;
    }
    private void preOrder(TreeNode root, List<TreeNode> list,int val)
    {
        if(root==null) return;
        if(root.val==val)
        {
            list.add(root);
        }
        preOrder(root.left,list,val);
        preOrder(root.right,list,val);
        
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null && head==null) return true;

        ListNode start=head;
        if(check(head,root)) return true;
        List<TreeNode> list = new ArrayList<>();
        preOrder(root,list,head.val);
        for(int i=0;i<list.size();i++)
        {
            if(check(head,list.get(i))) return true;
        }
        return false;
    }
}
