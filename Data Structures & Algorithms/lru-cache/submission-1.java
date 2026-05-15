class Node {
    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
    int key;
    int value;
    Node prev = null;
    Node next = null;
}

class LRUCache {
    Map<Integer, Node> map = new HashMap();
    int capacity;
    final Node left = new Node(0, 0);
    final Node right = new Node(0, 0);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        left.next = right;
        right.prev = left;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);
        } else {
            if (map.size() == capacity) {
                Node lru = right.prev;
                map.remove(lru.key);
                remove(lru);
            }
            Node node = new Node(key, value);
            insert(node);
            map.put(key, node);
        }
    }

    private void remove(Node node) {
        Node prev = node.prev;
        prev.next = node.next;
        node.next.prev = prev;
    }

    private void insert(Node node) {
        Node next = left.next;
        left.next.prev = node;
        node.next = next;
        left.next = node;
        node.prev = left;
    }
}
