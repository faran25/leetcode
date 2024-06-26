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
    private void inOrder(TreeNode root, List<Integer> list)
    {
        if(root==null) return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    private TreeNode createBST(List<Integer> list,int left,int right)
    {
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.left=createBST(list,left,mid-1);
        node.right=createBST(list,mid+1,right);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        TreeNode node=createBST(list,0,list.size()-1);
        return node;
    }
}
