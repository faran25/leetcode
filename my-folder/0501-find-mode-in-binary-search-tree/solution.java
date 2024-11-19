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
    public void func(TreeNode root, HashMap<Integer,Integer> map)
    {
        if(root==null) return;
        if(map.containsKey(root.val))
        {
            map.put(root.val,map.get(root.val)+1);
        }
        else
        {
            map.put(root.val,1);
        }
        func(root.left,map);
        func(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        func(root,map);
        int max=1;
        for (Integer key : map.keySet()) {
            if(map.get(key)>max) max=map.get(key);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (Integer key : map.keySet()) {
            if(map.get(key)==max) {
                
                list.add(key);
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(Integer num:list)
        {
            ans[i++]=num;
        }
        return ans;
    }
}
