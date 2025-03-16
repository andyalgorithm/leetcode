package prefixSum;

import org.junit.Assert;
import org.junit.Test;

public class ProductOfNumbersTest {

    private ProductOfNumbers product = new ProductOfNumbers();

    @Test
    public void test1() {
        product.add(3);
        product.add(0);
        product.add(2);
        product.add(5);
        product.add(4);
        int res;
        res = product.getProduct(2);
        Assert.assertEquals(20, res);

        res = product.getProduct(3);
        Assert.assertEquals(40, res);

        res = product.getProduct(4);
        Assert.assertEquals(0, res);


        product.add(8);
        res = product.getProduct(2);
        Assert.assertEquals(32, res);
    }
}
