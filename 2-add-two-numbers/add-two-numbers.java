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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;

        int vv = l1.val + l2.val + c;
        ListNode l3 = new ListNode(vv % 10), list = l3;
        c = vv / 10;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null) {
            int v = l1.val + l2.val + c;
            ListNode temp = new ListNode(v % 10);
            c = v / 10;
            l1 = l1.next;
            l2 = l2.next;
            l3.next = temp;
            l3 = l3.next;
        }

        while (l2 != null) {
            int v = l2.val + c;
            ListNode temp = new ListNode(v % 10);

            c = v / 10;

            l3.next = temp;

            l2 = l2.next;
            l3 = l3.next;
        }
        while (l1 != null) {
            int v = l1.val + c;
            ListNode temp = new ListNode(v % 10);
            l3.next = temp;
            c = v / 10;

            l1 = l1.next;
            l3 = l3.next;
        }
        if (c!=0){
          ListNode l = new ListNode (c);
          l3.next = l;
        }

        return list;
    }
}
