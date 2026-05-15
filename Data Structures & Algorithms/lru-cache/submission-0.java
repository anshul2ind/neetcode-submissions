class LRUCache {
    SequencedMap<Integer, Integer> map = new LinkedHashMap();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            int value = map.get(key);
            put(key, value);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            map.remove(key);
        }
        if(map.size() == capacity) {
            map.pollFirstEntry();
        }
        map.put(key, value);

    }
}
