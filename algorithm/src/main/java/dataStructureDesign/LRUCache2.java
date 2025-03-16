package dataStructureDesign;

import java.util.LinkedHashMap;

/**
 * 146 LRU 缓存机制
 */


// 使用LinkedHashMap双链表来处理

public class LRUCache2 {

    private int capacity;
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

    public LRUCache2(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            int value = map.get(key);
            moveHead(key);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            map.replace(key, value);
        } else {
            map.put(key, value);
        }

        if(map.size()>capacity) {
            int removeKey = map.keySet().iterator().next();
            map.remove(removeKey);
        }


    }

    void moveHead(int key) {
        int value = map.get(key);
        // 删除元素
        map.remove(key);
        // 添加到队尾
        map.put(key, value);
    }


}
