package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class TailingZerosTest {

    private TailingZeros tailing = new TailingZeros();

    @Test
    public void tailingZerosTest1() {
        int res = tailing.tailingZeros(3);
        Assert.assertEquals(res, 0);
    }

    @Test
    public void tailingZerosTest2() {
        int res = tailing.tailingZeros(125);
        Assert.assertEquals(res, 31);
    }

    @Test
    public void tailingZerosTest3() {
        int res = tailing.tailingZeros(25);
        Assert.assertEquals(res, 6);
    }
}
