package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class SearchPositionTest {

    private SearchPosition search = new SearchPosition();

    @Test
    public void searchTest1() {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int res = search.search(nums, 9);
        Assert.assertEquals(4, res);
    }

    @Test
    public void searchTest2() {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int res = search.search(nums, 9);
        Assert.assertEquals(4, res);
    }

    @Test
    public void searchTest3() {
        int[] nums = new int[] {};
        int res = search.search(nums, 2);
        Assert.assertEquals(-1, res);
    }
}
