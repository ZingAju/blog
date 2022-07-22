package com.zingscoop.systemdesign.customhashmap;

public class HashEntry<K,V> {
    K key;
    V value;
    HashEntry<K,V> next;

    public HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "HashEntry [key=" + key + ", next=" + next + ", value=" + value + "]";
    }

}
