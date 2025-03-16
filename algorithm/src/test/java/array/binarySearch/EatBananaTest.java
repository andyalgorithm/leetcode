package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class EatBananaTest {

    private EatBanana eat = new EatBanana();

    @Test
    public void eatBanana1() {
        int[] nums = new int[] {3,6,7,11};
        int hour = 8;
        int res = eat.eatBanana(nums, hour);
        Assert.assertEquals(4, res);
    }

    @Test
    public void eatBanana2() {
        int[] nums = new int[] {30,11,23,4,20};
        int hour = 5;
        int res = eat.eatBanana(nums, hour);
        Assert.assertEquals(30,res);
    }

    @Test
    public void eatBanana3() {
        int[] nums = new int[] {30,11,23,4,20};
        int hour = 6;
        int res = eat.eatBanana(nums, hour);
        Assert.assertEquals(23, res);
    }
}
