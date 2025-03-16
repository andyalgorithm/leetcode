package binaryHeap;

import org.junit.Assert;
import org.junit.Test;

/**
 * 1834. 单线程 CPU
 */

public class SingleThreadCPUTest {

    private SingleThreadCPU orders = new SingleThreadCPU();

    @Test
    public void test1() {
        int[][] tasks = new int[][]{{1,2}, {2,4}, {3,2}, {4,1}};
        int[] res = orders.singleThreadCPU(tasks);
        int[] expect = new int[] {0,2,3,1};
        Assert.assertArrayEquals(expect, res);
    }

    @Test
    public void test2() {
        int[][] tasks = new int[][]{{7,10}, {7,12}, {7,5}, {7,4}, {7,2}};
        int[] res = orders.singleThreadCPU(tasks);
        int[] expect = new int[] {4,3,2, 0, 1};
        Assert.assertArrayEquals(expect, res);
    }


}
