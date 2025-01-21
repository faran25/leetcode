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
    int index=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode tree(int[] postorder, int left, int right)
    {
        if(left>right || index<0) return null;
        int rootValue=postorder[index--];
        TreeNode root=new TreeNode(rootValue);
        root.right=tree(postorder,map.get(rootValue)+1,right);
        root.left=tree(postorder,left,map.get(rootValue)-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return tree(postorder,0,postorder.length-1);
    }
}
