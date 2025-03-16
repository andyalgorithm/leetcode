package binaryHeap;

/**
 * 295 数据流中的中位数
 */

import java.util.PriorityQueue;

public class MedianData {
    // large的最小值 >= small的最大值
    // 从小到大排序
    private PriorityQueue<Integer> large = new PriorityQueue<>((a, b) -> {
        return a-b;
    });
    // 从大到小排序
    private PriorityQueue<Integer> small = new PriorityQueue<>((a, b) -> {
        return b-a;
    });

    public void addNum(int num) {
        // 先往small队列中存入值，然后将最大值传递给large队列
        if(small.size()>large.size()) {
            small.add(num);
            Integer temp = small.poll();
            large.add(temp);
        } else {
            large.add(num);
            small.add(large.poll());
        }

    }

    public double findMedian() {
        // 判断数据小于2个的情况
        if(small.isEmpty() && large.isEmpty()) {
            return 0;
        } else if(large.isEmpty()) {
            return small.peek();
        }
        // 若small队列长度>大于large队列长度，那么small顶部就是中位数
        if(small.size()==large.size()) {
            return (small.peek()+large.peek())/2.0;
        } else if(small.size()<large.size()) {
            return large.peek();
        } else {
            return small.peek();
        }
    }
}
