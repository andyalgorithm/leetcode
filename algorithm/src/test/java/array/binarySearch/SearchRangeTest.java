package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class SearchRangeTest {

    @Test
    public void searchRangeTest1() {
        int[] nums = new int[] {};
        int[] res = new SearchRange().searchRange(nums, 8);
        Assert.assertArrayEquals(res, new int[]{-1,-1});
    }



    @Test
    public void searchRangeTest2() {
        int[] nums = new int[] {5,7,7,8,8,10};
        int[] res = new SearchRange().searchRange(nums, 8);
        Assert.assertArrayEquals(res, new int[]{3,4});

    }

    @Test
    public void searchRangeTest3() {
        int[] nums = new int[] {5,7,7,8,8,10};
        int[] res = new SearchRange().searchRange(nums, 6);
        Assert.assertArrayEquals(res, new int[]{-1,-1});

    }












}
