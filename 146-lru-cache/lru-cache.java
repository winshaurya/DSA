class Node {
    int key ;
    int val;
    Node next;
    Node prev;
    public Node (int a , int b){
    this.key = a;
    this.val = b ;
    this.prev= null;
    this.next = null;
    }
}


class LRUCache {
    HashMap<Integer, Node> m ;
    int cap;
    Node old;
    Node lat;

    public LRUCache(int capacity) {
        this.cap = capacity ;
        this.m  = new HashMap<>();
        this.old = new Node (0,0);
        this.lat = new Node(0,0);
        this.lat.prev = this.old;
        this.old.next= this.lat;
    }
    
    public int get(int key) {
       if (!m.containsKey(key )) return -1;
       remove (m.get(key));
       insert(m.get(key));
       return m.get(key).val;

    }
    
    public void put(int key, int value) {
        if (m.containsKey(key)){
            remove (m.get(key));
        }
        Node k = new Node(key, value);
        
        m.put(key, k);
        insert(k);
        if (m.size()> cap){
            Node n = old.next;
            m.remove(n.key);
            remove(old.next);
        }
    }
    public void remove ( Node n ){
        Node k  = n.next;
        Node p = n.prev;
        k.prev = p;
        p.next = k;
    }
    public void insert(Node n ){
        Node p = lat.prev;
        p.next= n;
        lat.prev= n;
        n.prev= p;
        n.next=  lat;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = nmew LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */