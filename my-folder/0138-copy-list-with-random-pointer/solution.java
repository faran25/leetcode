/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node ans = new Node(-1);
        Node prev = ans;
        Node curr = head;
        Node next = head;
        while (curr != null) {
            next = curr.next;
            Node temp = new Node(curr.val);
            curr.next = temp;
            temp.next=next;
            curr = next;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        prev = ans;
        Node temp = prev;
        Node copy = ans;

        while (curr != null) {
            next = curr.next.next;

            // extract the copy
            copy = curr.next;
            prev.next = copy;
            prev = copy;

            // restore the original list
            curr.next = next;

            curr = next;
        }
        return ans.next;

    }
}
