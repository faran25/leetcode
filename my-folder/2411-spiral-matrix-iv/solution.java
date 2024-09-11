/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        int ans[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = -1;
            }
        }
        while (true) {
            if(head == null) break;
            if (left > right )
                break;
            for (int i = left; i <= right && head != null; i++, head = head.next) {
                ans[top][i] = head.val;
            }
            top++;
            if (top > bottom)
                break;
            for (int i = top; i <= bottom && head != null; i++, head = head.next) {
                ans[i][right] = head.val;
            }
            right--;
            if (left > right )
                break;
            for (int i = right; i >= left && head != null; i--, head = head.next) {
                ans[bottom][i] = head.val;
            }
            bottom--;
            if (top > bottom)
                break;
            for (int i = bottom; i >= top && head != null; i--, head = head.next) {
                ans[i][left] = head.val;                
            }
            left++;
        }
        return ans;
    }
}
