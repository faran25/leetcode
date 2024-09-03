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
    public void preOrder(TreeNode root,int level, HashMap<Integer,List<Integer>> map)
    {
        if(root == null) return;
        if(map.containsKey(level))
        {
            map.get(level).add(root.val);
        }else
        {
            List<Integer> list= new ArrayList<>();
            list.add(root.val);
            map.put(level,list);
        }
        preOrder(root.left,level+1,map);
        preOrder(root.right,level+1,map);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        List<List<Integer>> list=new ArrayList<>();
        preOrder(root,0,map);
        int level=0;
        while(map.containsKey(level))
        {
            list.add(map.get(level++));
        }
        return list;
    }
}
