package stack_queue;

/**
 * [239. 滑动窗口最大值]
 */

import java.util.LinkedList;

class MonotonicQueue {
    LinkedList<Integer> max = new LinkedList<Integer>();
    int length;

    public MonotonicQueue(int length) {
        this.length = length;
    }

    public void push(Integer num) {
        // 将⼩于 n 的元素全部删除
        while (!max.isEmpty() && max.getLast() < num) {
            max.pollLast(); // 从后往前删除
        }
        // 将数值加入尾部
        max.addLast(num);

        // 如果超过链表容量，则移除第一个元素
        if (max.size() > length) {
            max.removeFirst(); // 移除首元素
        }
    }

    public int getMax() {
        return max.getFirst();
    }
}

public class SlidingWindowMax {

    public int[] slidingWindowMax(int[] nums, int k) {
        int[] res = new int[nums.length+1-k];
        MonotonicQueue queue = new MonotonicQueue(k);

        for(int i=0;i<nums.length;i++) {
            //先填满窗⼝的前 k - 1
            if(i<k-1) {
                queue.push(nums[i]);
                continue;
            }
            queue.push(nums[i]);
            // 记录当前窗⼝的最⼤值
            res[i+1-k]=queue.getMax();
        }

        return res;
    }
}
