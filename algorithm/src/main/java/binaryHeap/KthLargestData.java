package binaryHeap;

import java.util.PriorityQueue;

public class KthLargestData {
    // 从小到大排序，容量为k
    PriorityQueue<Integer> large = new PriorityQueue<>((a,b) -> {
        return a-b;
    });
    int capacity;


    public KthLargestData(int k, int[] nums) {
        capacity = k;
        for(int num : nums) {
            this.add(num);
        }
    }

    public int add(int val) {
        large.add(val);
        if(large.size()>capacity) {
            large.poll();
        }
        return large.peek();
    }
}
