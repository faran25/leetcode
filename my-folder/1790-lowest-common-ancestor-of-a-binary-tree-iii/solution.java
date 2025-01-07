/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        HashSet<Node> set=new HashSet<>();
        set.add(p);
        while(p.parent!=null)
        {
            p=p.parent;
            set.add(p);
        }

        while(!set.contains(q))
        {
            q=q.parent;
        }
        return q;
    }
}
