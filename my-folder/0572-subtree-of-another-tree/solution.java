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
    boolean flag=false;
    public boolean check(TreeNode root, TreeNode subRoot)
    {
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        if(root.val!=subRoot.val) return false;
        if(check(root.left,subRoot.left) && check(root.right,subRoot.right))
        {
            return true;
        }
        return false;
    }

    public void inOrder(TreeNode root, TreeNode subRoot)
    {
        if(flag) return;
        if(root==null ) return;
        if(root.val==subRoot.val)
        {
            flag=check(root,subRoot);
        }
        if(!flag){
            inOrder(root.left,subRoot);
        }
        if(!flag)
        inOrder(root.right,subRoot);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        inOrder(root,subRoot);
        return flag;
    }
}
