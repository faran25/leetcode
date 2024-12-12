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
    public TreeNode lca(TreeNode root, int p, int q)
    {
        if(root==null) return null;
        int val=root.val;
        if(val>p && val>q)
        {
            return lca(root.left, p, q);
        }else if(val<p && val<q)
        {
            return lca(root.right, p, q);
        }
        else return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root, p.val, q.val);
    }
}
