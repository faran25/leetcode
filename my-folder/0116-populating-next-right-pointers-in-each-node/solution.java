/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    /*private void level(Node root, HashMap<Integer,Node> map, int level)
    {
        if(root==null) return;
        if(map.containsKey(level)){
        Node node=map.get(level);
        node.next=root;
        }
        map.put(level,root);
        level(root.left,map,level+1);
        level(root.right,map,level+1);
    }

    public Node connect(Node root) {
        HashMap<Integer,Node> map = new HashMap<>();
        level(root,map,0);
        return root;
    }*/
    private void level(Node root)
    {
        if(root==null || root.left==null) return;
        root.left.next=root.right;
        if (root.next != null) {
            root.right.next = root.next.left;
        }
        level(root.left);
        level(root.right);
    }
    public Node connect(Node root) {
        level(root);
        return root;
    }
}
