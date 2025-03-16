package binaryHeap;

import org.junit.Assert;
import org.junit.Test;

public class MedianDataTest {
    private MedianData data = new MedianData();


    @Test
    public void test1() {

        data.addNum(1);
        data.addNum(2);
        double res;
        res = data.findMedian();
        Assert.assertEquals(1.5, res, 0.00001);

        data.addNum(3);
        res = data.findMedian();
        Assert.assertEquals(2.0, res, 0.00001);

    }


}
