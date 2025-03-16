package dataStructureDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *  460 LFU缓存
 */

class LFUNode {
    int index;
    int key;
    int val;
    int count;

    public LFUNode(int index, int key, int val) {
        this.index = index;
        this.key = key;
        this.val = val;
        this.count = 0;
    }

    public void increase() {
        count++;
    }
}

public class LFUCache {
    int capacity;
    int index = 0;
    HashMap<Integer, LFUNode> map = new HashMap<>();

    // 按照访问次数、存放时间从小到大排序、
    PriorityQueue<LFUNode> queue = new PriorityQueue<>(
            (o1, o2) -> {
                if(o1.count==o2.count) {
                    return o1.index - o2.index;
                }else {
                    return o1.count - o2.count;
                }
            }
    );


    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    int get(int key) {
        if(map.containsKey(key)) {
            LFUNode temp = map.get(key);
            // 更新访问次数
            temp.increase();
            // 更新索引编号
            temp.index = index;
            index++;
            return temp.val;
        }
        return -1;
    }

    void put(int key, int val) {
        if(map.containsKey(key)) {
            // 更新数据
            LFUNode data = map.get(key);
            data.val = val;
            data.increase();
            data.index = index;
            index++;
        } else {
            // 判断是否超过缓存
            if(map.size()>=capacity) {

                LFUNode d = queue.poll();
                d.count = 0;
                map.remove(d.key);
            }

            LFUNode temp = new LFUNode(index, key, val);
            map.put(key, temp);
            queue.add(temp);
            index++;
        }
    }
}
