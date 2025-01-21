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
    int preorderIndex=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode tree(int[] preorder, int left, int right)
    {
        if(left>right || preorderIndex>=preorder.length) return null;
        int rootValue=preorder[preorderIndex++];
        TreeNode root=new TreeNode(rootValue);

        root.left=tree(preorder,left,map.get(rootValue)-1);
        root.right=tree(preorder,map.get(rootValue)+1,right);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return tree(preorder,0,preorder.length-1);
    }
}
