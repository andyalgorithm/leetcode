package binaryHeap;

/**
 * 703. 数据流中的第 K 大元素
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class KthLargestDataTest {

    HashSet<Integer> set = new HashSet<>();

    private KthLargestData kdata;

    @Test
    public void test1() {
        int[] nums = new int[] {4, 5, 8, 2};
        int k = 3;
        kdata = new KthLargestData(k, nums);
        int res;
        res = kdata.add(3);
        Assert.assertEquals(4, res);

        res = kdata.add(5);
        Assert.assertEquals(5, res);

        res = kdata.add(10);
        Assert.assertEquals(5, res);

        res = kdata.add(9);
        Assert.assertEquals(8, res);

        res = kdata.add(4);
        Assert.assertEquals(8, res);
    }
}
