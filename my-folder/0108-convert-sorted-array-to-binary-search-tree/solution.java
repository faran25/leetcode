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
    private TreeNode convert(int[] nums, int l, int r)
    {
        if(l>r) return null;
        int mid=(l+r)/2;
        TreeNode node = new TreeNode();
        node.val=nums[mid];
        node.left=convert(nums,l,mid-1);
        node.right=convert(nums,mid+1,r);
        return node;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node=new TreeNode();
        node=convert(nums,0,nums.length-1);
        return node;
    }
}
