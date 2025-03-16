package array.slideWindow;

import java.util.LinkedList;

// 这是对 [239. 滑动窗⼝最⼤值] 的改编，求最小值

public class MinimumWindow {

    // 使用单调队列求解，时间复杂度为O(N)
    public int[] minimumWindow(int[] nums, int k) {
        if (k < 1 || nums.length < k) {
            return new int[]{};
        }

        MonotonicMinQueue window = new MonotonicMinQueue();
        int[] res = new int[nums.length+1-k];

        for(int i=0;i<nums.length;i++) {
            if(i<k-1) {
                // 先填满窗口的前 k - 1
                window.push(nums[i]);
            }else {
                window.push(nums[i]);
                res[i+1-k]=window.min();
                // 移除最左侧数据
                window.pop(nums[i+1-k]);
            }
        }
        return res;
    }


}

/* 单调队列的实现 */
class MonotonicMinQueue {
    // 队列的第一个值最大，后面的值按照添加顺序排列
    LinkedList<Integer> minq = new LinkedList<Integer>();

    public void push(int n) {
        // 将大于 n 的元素全部删除(等于时保留)
        while(!minq.isEmpty() && minq.getLast()>n) {
            minq.pollLast();
        }
        // 然后将 n 加入尾部
        minq.addLast(n);
    }

    public int min() {
        return minq.getFirst();
    }

    // 若元素大于    队列头部元素，那么会在添加的时候自动删除
    // 所以我们只需要判断是否为第一个元素，是的话才需要手动删除
    public void pop(int n) {
        if(n==minq.getFirst()) {
            minq.pollFirst();
        }
    }
}
