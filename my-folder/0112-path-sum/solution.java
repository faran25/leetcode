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
    private boolean sum(TreeNode root, int currSum, int targetSum)
    {
        if(root==null) return false;
        currSum=currSum+root.val;
        if(root.left==null && root.right ==null && currSum==targetSum) return true;
        boolean left = false;
        boolean right= false;

        if(root.left!=null)
        {
            left = sum(root.left,currSum,targetSum);
        }
        if(root.right!=null)
        {
            right= sum(root.right,currSum,targetSum);
        }
        
        if(left || right) return true;
        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return sum(root, 0, targetSum );
        

        
    }
}
