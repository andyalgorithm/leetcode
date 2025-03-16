package binaryHeap;

/**
 * 1845. 座位预约管理系统
 */

import java.util.PriorityQueue;

public class SeatReserve {

    // 从小到大排序，表示可预订座位编号
    private PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> {
        return a-b;
    });
    private int num;

    public SeatReserve(int n) {
        num = n;
        for(int i=0;i<n;i++) {
            queue.add(i+1);
        }
    }

    public int reserve() {
        // 可预订情况下，优先预定小编号座位
        if(queue.size()>0) {
            return queue.poll();
        } else {
            return -1;
        }
    }

    public void unreserve(int seatNumber) {
        if(queue.size()<num) {
            queue.add(seatNumber);
        }
    }
}
