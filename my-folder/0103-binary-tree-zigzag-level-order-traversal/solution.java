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
    void levelOrder(TreeNode node, HashMap<Integer, List<Integer>> map,int level)
    {
        if(node==null) return;
        if(map.containsKey(level))
        {
            List<Integer> list=map.get(level);
            list.add(node.val);
            map.put(level,list);
        }else
        {
            List<Integer> list=new ArrayList<>();
            list.add(node.val);
            map.put(level,list);
        }
        levelOrder(node.left,map,level+1);
        levelOrder(node.right,map,level+1);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         HashMap<Integer, List<Integer>> map=new HashMap<>();
        List<List<Integer>> list=new ArrayList<>();
        levelOrder(root,map,0);
        int count=0;
        while(map.containsKey(count))
        {
            if(count%2==0)
            {
                list.add(map.get(count));
                
            }
            else
            {
                List<Integer> reverse=map.get(count);
                Collections.reverse(reverse);
                list.add(reverse);
            }
            count++;
        }
        return list;
    }
}
