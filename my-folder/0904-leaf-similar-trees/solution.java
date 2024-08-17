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
    private void preOrder(TreeNode root, Queue q)
    {
        if(root==null) return;
        if(root.left == null && root.right==null)
        {
            q.add(root.val);
            return;
        }
        preOrder(root.left,q);
        preOrder(root.right,q);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        preOrder(root1,q1);
        preOrder(root2,q2);
        if(q1.size()!=q2.size()) return false;
        while(q1.size()>0)
        {
            if(!q1.poll().equals(q2.poll())) return false;
        }
        return true;
    }
}
