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
    public void level(TreeNode root, HashMap<Integer,Long> map, int level)
    {
        if(root==null) return;
        if(map.containsKey(level))
        {
            map.put(level,map.get(level)+root.val);
        }else
        {
            map.put(level,root.val*1l);
        }
        level(root.left,map,level+1);
        level(root.right,map,level+1);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        HashMap<Integer,Long> map=new HashMap<>();
        level(root,map,0);
        ArrayList<Long> list=new ArrayList<>(k);
        int level=0;
        for (Long value : map.values()) {
            list.add(value);
        }
        if(k>list.size()) return -1;
        Collections.sort(list);
        k=list.size()-k;
        return list.get(k);
    }
}
