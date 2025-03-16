package binaryHeap;

import org.junit.Assert;
import org.junit.Test;

public class SeatReserveTest {

    private SeatReserve seat;

    @Test
    public void test1() {
        seat = new SeatReserve(5);
        int res, expect;
        res = seat.reserve();
        expect = 1;
        Assert.assertEquals(expect, res);

        res = seat.reserve();
        expect = 2;
        Assert.assertEquals(expect, res);

        seat.unreserve(2);

        res = seat.reserve();
        expect = 2;
        Assert.assertEquals(expect, res);

        res = seat.reserve();
        expect = 3;
        Assert.assertEquals(expect, res);

        res = seat.reserve();
        expect = 4;
        Assert.assertEquals(expect, res);

        res = seat.reserve();
        expect = 5;
        Assert.assertEquals(expect, res);

        seat.unreserve(5);
    }
}
