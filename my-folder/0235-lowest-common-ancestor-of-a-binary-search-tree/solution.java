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
    //using
    public TreeNode lca(TreeNode root, int p, int q)
    {
        if(root==null) return null;
        int val=root.val;
        // if curr val is greater than both the values then answer lies in the left part of root
        // if curr val is smaller than both the values then answer lies in the right part of root
        //otherwise root is the answer
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
