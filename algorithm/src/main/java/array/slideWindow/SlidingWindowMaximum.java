package array.slideWindow;

import java.util.*;

/**
 * 239. 滑动窗⼝最⼤值
 */

public class SlidingWindowMaximum {

    // 两个循环，时间复杂度为O(kN)
    public int[] maximumWindow(int[] nums, int k) {
        // 参数处理
        if(k<1 || nums.length<k) {
            return new int[]{};
        }

        int left=0, right=0;
        int[] res = new int[nums.length+1-k];

        for(int i=k;i<=nums.length;i++) {
            int temp = Integer.MIN_VALUE;
            for(int j=i-k;j<i;j++) {
                temp = Math.max(temp, nums[j]);
            }
            res[i-k] = temp;
//            System.out.println(temp);
        }

        return res;
    }

    // 使用单调队列求解，时间复杂度为O(N)
    public int[] maximumWindow2(int[] nums, int k) {
        if (k < 1 || nums.length < k) {
            return new int[]{};
        }

        MonotonicQueue window = new MonotonicQueue();
        int[] res = new int[nums.length+1-k];

        for(int i=0;i<nums.length;i++) {
            if(i<k-1) {
                // 先填满窗口的前 k - 1
                window.push(nums[i]);
            }else {
                window.push(nums[i]);
                res[i+1-k]=window.max();
                // 移除最左侧数据
                window.pop(nums[i+1-k]);
            }
        }
        return res;
    }


}

/* 单调队列的实现 */
class MonotonicQueue {
    // 队列的第一个值最大，后面的值按照添加顺序排列
    LinkedList<Integer> maxq = new LinkedList<Integer>();

    public void push(int n) {
        // 将小于 n 的元素全部删除(等于时保留)
        while(!maxq.isEmpty() && maxq.getLast()<n) {
            maxq.pollLast();
        }
        // 然后将 n 加入尾部
        maxq.addLast(n);
    }

    public int max() {
        return maxq.getFirst();
    }

    // 若元素小于队列头部元素，那么会在添加的时候自动删除
    // 所以我们只需要判断是否为第一个元素，是的话才需要手动删除
    public void pop(int n) {
        if(n==maxq.getFirst()) {
            maxq.pollFirst();
        }
    }
}
