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
    static boolean flag = true;
    private int height(TreeNode root)
    {
        if(root == null ) return 0;
        int left=height(root.left);
        int right=height(root.right);
        if(left==-1 || right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return 1+(Math.max(left,right));
    }
    public boolean func(TreeNode root)
    {
        if(root==null) return true;
        int left=height(root.left);
        int right=height(root.right);
        if(left==-1 || right ==-1) return false;
        if(Math.abs(left-right)<=1 ) return true;
        return false;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
       return func(root);
    }
}
