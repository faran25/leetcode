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
    Node ans;
    int diff;
    public void inOrder(Node root, Node node)
    {
        if(root==null) return;
        else if(root.val>node.val && root.val-node.val<diff)
        {
            ans=root;
            diff=root.val-node.val;
        }
        inOrder(root.left,node);
        inOrder(root.right,node);
    }
    public Node inorderSuccessor(Node node) {
        if(node==null) return null;
        Node root;
        if(node.parent==null) root=node;
        else if(node.right!=null) root=node.right;
        else
        {
            root=node;
            while(root.parent!=null)
            {
                root=root.parent;
            }
        }
        diff=Integer.MAX_VALUE;
        inOrder(root, node);
        return ans;
    }
}
