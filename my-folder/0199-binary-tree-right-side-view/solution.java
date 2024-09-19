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
    public void func(TreeNode root, HashMap<Integer,Integer> map,int level)
    {
        if(root==null) return ;
        if(!map.containsKey(level)) 
        {
            map.put(level,root.val);
        }
        func(root.right,map,level+1);
        func(root.left,map,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        func(root,map,0);
        int level=0;
        while(map.containsKey(level))
        {
            list.add(map.get(level++));
        }
        return list;
    }
}
