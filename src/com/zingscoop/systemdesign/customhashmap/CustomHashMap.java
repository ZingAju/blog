package com.zingscoop.systemdesign.customhashmap;

public class CustomHashMap<K,V> {

    
    private static final int initial_threshold = 10;
    private int size = 0;

    private final HashEntry<K,V>[] entries = new HashEntry[initial_threshold];


    // Simple hash function to get some bucket index where value need to be stored
    public int getHashValue(K key) {
        return Math.abs(key.hashCode()) % initial_threshold;
    }

    // put method implementation

    public void put(K key, V value) {
        int hash = getHashValue(key);

        HashEntry<K,V> entry = new HashEntry(key, value);

        // Key not exists
        if(entries[hash] == null) {
            entries[hash] = entry;
            ++size; 
        } else {  // Key does exist, so collision, loop over linked list and put it at the end.
            HashEntry<K,V> current = entries[hash];
            while (current.next != null) {
                current = current.next;
            }
            current.next = entry;
            ++size;
        }
    }

    // get method implementation

    public V get(K key) {

        int hash = getHashValue(key);

        if(entries[hash] != null) {
            HashEntry<K,V> current = entries[hash];
            while(current != null) {
                //Found the right guy - here !! return it.
                if(current.key.equals(key)) {
                    return current.value;
                }
                current = current.next;
            }
        }

        return null;
    }

    // Size implementation

    public int size() {
        return size;
    }
    
}
