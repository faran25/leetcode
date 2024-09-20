/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private Node DFS(Node node, HashMap<Integer, Node> map) {
        if (node == null) return null;
        if (map.containsKey(node.val)) return map.get(node.val);
        
        Node cloneNode = new Node(node.val);
        map.put(cloneNode.val, cloneNode);
        
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(DFS(neighbor, map));
        }
        
        return cloneNode;
    }
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        
        HashMap<Integer, Node> map = new HashMap<>();
        return DFS(node, map);
    }
}
