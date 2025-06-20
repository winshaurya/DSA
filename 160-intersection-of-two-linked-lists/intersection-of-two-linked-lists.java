/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s = new HashSet<>();
        while (headA != null || headB!= null ){
            if (s.contains(headA)) return headA;
            if(s.contains(headB))return headB;
            if (headA == headB) return headB;
                if (headB!=null){
                    s.add(headB);
                    headB= headB.next;
                    }
                if (headA!=null){
                    s.add(headA);
                    headA= headA.next;
                    }
        }
        return null;
    }
}