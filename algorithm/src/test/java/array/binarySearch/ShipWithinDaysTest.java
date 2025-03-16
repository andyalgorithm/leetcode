package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class ShipWithinDaysTest {

    private ShipWithinDays days = new ShipWithinDays();

    @Test
    public void shipWithinDays1() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        int res = days.shipWithinDays(nums, 5);
        Assert.assertEquals(res, 15);
    }

    @Test
    public void shipWithinDays2() {
        int[] nums = new int[]{3,2,2,4,1,4};
        int res = days.shipWithinDays(nums, 3);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void shipWithinDays3() {
        int[] nums = new int[]{1,2,3,1,1};
        int res = days.shipWithinDays(nums, 4);
        Assert.assertEquals(res, 3);
    }
}
