package io.github.craftqq.utility;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BidirectionalMap<K, V>{
    private Map<K, V> keyToValueMap = new ConcurrentHashMap<K, V>();
    private Map<V, K> valueToKeyMap = new ConcurrentHashMap<V, K>();

    synchronized public void put(K key, V value){
        keyToValueMap.put(key, value);
        valueToKeyMap.put(value, key);
    }

    synchronized public V removeByKey(K key){
        V removedValue = keyToValueMap.remove(key);
        valueToKeyMap.remove(removedValue);
        return removedValue;
    }

    synchronized public K removeByValue(V value){
        K removedKey = valueToKeyMap.remove(value);
        keyToValueMap.remove(removedKey);
        return removedKey;
    }

    public boolean containsKey(K key){
        return keyToValueMap.containsKey(key);
    }

    public boolean containsValue(V value){
        return valueToKeyMap.containsKey(value);
    }

    public K getKey(V value){
        return valueToKeyMap.get(value);
    }

    public V get(K key){
        return keyToValueMap.get(key);
    }
}