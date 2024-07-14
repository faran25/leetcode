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
    int min=-1;
    long ans=-1;
    private void find(TreeNode root)
    {
        if(root == null) return;
        if(root.val<min)
        {
            ans=min;
            min=root.val;
        } else if(root.val != min && root.val<ans){
            ans=root.val;
        }
        find(root.left);
        find(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        min=root.val;
        ans=Integer.MAX_VALUE*2l;
        find(root);
        if(ans!=Integer.MAX_VALUE*2l)
        return (int)ans;
        return -1;
    }
}
