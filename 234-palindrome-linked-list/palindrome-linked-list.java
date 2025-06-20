/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode l = head;
        Stack<ListNode> s = new Stack<>();
        while (l != null) {
            s.push(l);
            l = l.next;
        }
        while (!s.isEmpty()) {
            if (s.pop().val != head.val) return false;
            head= head.next;
        }
        return true;
    }
}
