class LRUCache {

    Map<Integer, Integer> lruMap;
    int initialSize = 0;
    public LRUCache(int capacity)
    {
        lruMap = new LinkedHashMap<>(capacity);
        initialSize = capacity;
    }

    public int get(int key)
    {
        int value = -1;
        if(lruMap.containsKey(key))
        {
            value = lruMap.get(key);
            lruMap.remove(key);
            lruMap.put(key,value);
        }
        return value;
    }

    public void put(int key, int value)
    {
        if(lruMap.containsKey(key))
        {
            lruMap.remove(key);
            lruMap.put(key,value);
        }

        else
            {
                if (lruMap.size() + 1 > initialSize) {
                    Integer firstIndex = (Integer) lruMap.keySet().toArray()[0];
                    lruMap.remove(firstIndex);
                }

                lruMap.put(key, value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */