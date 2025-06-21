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
        if (head == null ) return null;
        List<Node> l = new ArrayList<>();
        Map<Node, Node> m = new HashMap<>();
        Node a = head;
        while (head != null) {
            Node n = new Node(head.val);
            n.random = head.random;
            Node old = head.next;
            m.put(head, old);
            head.next = n;
            head = old;

            l.add(n);
        }

        for (int i = 0; i < l.size(); i++) {
            if (i < l.size()-1) l.get(i).next = l.get(i + 1);
            if (l.get(i).random != null) l.get(i).random = l.get(i).random.next;
        }
        for (Node n : m.keySet()) {
            n.next = m.get(n);
        }

        return l.get(0);
    }
}
