/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans;
    int diff=0;
    public void inOrder(TreeNode root, TreeNode p)
    {
        if(root==null ) return ;
        if(root.val-p.val>0 && root.val-p.val<diff)
        {
            diff=root.val-p.val;
            ans=root;
        }
        inOrder(root.left,p);
        inOrder(root.right,p);
    }
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        diff=Integer.MAX_VALUE;
        inOrder(root,p);
        if(diff==Integer.MAX_VALUE) return null;
        return ans;
    }
}
