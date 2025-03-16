package binaryHeap;

/**
 * 1834. 单线程 CPU
 */



import java.util.ArrayList;
import java.util.PriorityQueue;

public class SingleThreadCPU {

    // 我的方法
    public int[] singleThreadCPU(int[][] tasks) {

        class Task {
            // 任务起始时间
            int start;
            // 任务终止时间
            int end;
            // 执行任务所需要花费的时间
            int cost;
            // 任务索引
            int index;
            Task(int index, int start, int cost) {
                this.start = start;
                this.end = start+ cost;
                this.cost = cost;
                this.index = index;
            }
        }

        int[] res = new int[tasks.length];
        // 对任务的起始时间、执行时长、任务编号从小到大排序
        PriorityQueue<Task> queue1 = new PriorityQueue<Task>(
            (Task o1, Task o2) -> {
                if(o1.start==o2.start) {
                    if(o1.cost==o2.cost) {
                        return o1.index-o2.index;
                    }else {
                        return o1.cost-o2.cost;
                    }
                }else {
                    return o1.start - o2.start;
                }
            });
        // 对任务执行时长、索引编号从小到大排序
        PriorityQueue<Task> queue2 = new PriorityQueue<>(
                (o1, o2) -> {
                    if(o1.cost==o2.cost) {
                        return o1.index-o2.index;
                    }else {
                        return o1.cost-o2.cost;
                    }
                }
        );

        // 实例化Task
        for(int i=0; i<tasks.length; i++) {
            queue1.add(new Task(i, tasks[i][0], tasks[i][1]));
        }

        // 设置任务执行时间起点，小于该起点的任务均会添加到queue2中
        int start=0;
        // 保存到结果的索引值
        int p = 0;
        while(!queue1.isEmpty() || !queue2.isEmpty()) {
            // 取出queue1中数据，添加到queue2中
            while (!queue1.isEmpty() && queue1.peek().start<=start) {
                queue2.add( queue1.poll());
            }

            // 若为空，那么从queue1中存入数据
            if(queue2.isEmpty()) {
                assert queue1.peek() != null;
                start = queue1.peek().start;
                queue2.add(queue1.poll());
            }

            // 取出queue中的任务执行
            Task t2 = queue2.poll();
            res[p] = t2.index;
            p++;
            start = Math.max(start, t2.end);

        }
        return res;

    }
}
