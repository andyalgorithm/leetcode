package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class PreimageSizeZFTest {

    private PreimageSizeZF size = new PreimageSizeZF();

    @Test
    public void preimageSizeZFTest1() {
        int n = size.preimageSizeZF(0);
        Assert.assertEquals(n, 5);
    }

    @Test
    public void preimageSizeZFTest2() {
        int n = size.preimageSizeZF(1);
        Assert.assertEquals(n, 5);
    }

    @Test
    public void preimageSizeZFTest3() {
        int n = size.preimageSizeZF(2);
        Assert.assertEquals(n, 5);
    }

    @Test
    public void preimageSizeZFTest5() {
        int n = size.preimageSizeZF(5);
        Assert.assertEquals(n, 0);
    }

    @Test
    public void preimageSizeZFTest6() {
        int n = size.preimageSizeZF(6);
        Assert.assertEquals(n, 5);
    }
}
