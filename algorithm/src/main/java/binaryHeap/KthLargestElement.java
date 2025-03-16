package binaryHeap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 215. 数组中的第K个最⼤元素
 */

public class KthLargestElement {

    public int kthLargest(int[] nums, int k) {
        int res = 0;

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2; // 从小到大排序
//            }
//        };

//        PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);
        // 等价于

        // 从小到大排序
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(
                (o1, o2) -> {
                    return o1-o2;
                }
        );
        for(int i=0;i<nums.length;i++) {
            queue.add(nums[i]);
            if(queue.size()>k) {
                queue.poll(); // 移除最上面的元素
            }
        }
        res = queue.peek();


        return res;
    }


}
