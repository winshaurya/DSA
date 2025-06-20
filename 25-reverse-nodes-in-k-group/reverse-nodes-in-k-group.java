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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a = new ListNode ();
        ListNode ans= a;
        ListNode l = head; 
        int len = 0;
        while (l!= null){
            len++;
            l= l.next;
        }
        l = head;

        for (int i = 0 ; i < len/k ; i++){
            Stack <ListNode> s = new Stack<>();
            for (int j = 0 ; j < k ; j++ ){
               s.push(l);
               l = l.next;
            }
            for (int j = 0 ; j < k ; j++ ){
               a.next = s.pop();
               a = a.next;
            }
        }
        a.next= l ;

         return ans.next;
    }
}