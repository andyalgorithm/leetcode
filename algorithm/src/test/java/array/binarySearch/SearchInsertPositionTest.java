package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    @Test
    public void searchInsertTest1() {
        int[] nums = new int[] {};
        int res = new SearchInsertPosition().searchInsert(nums, 5);
        Assert.assertEquals(res, 0);
    }


    @Test
    public void searchInsertTest2() {
        int[] nums = new int[] {1,3,5,6};
        int res = new SearchInsertPosition().searchInsert(nums, 5);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void searchInsertTest3() {
        int[] nums = new int[] {1,3,5,6};
        int res = new SearchInsertPosition().searchInsert(nums, 2);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void searchInsertTest4() {
        int[] nums = new int[] {1,3,5,6};
        int res = new SearchInsertPosition().searchInsert(nums, 8);
        Assert.assertEquals(res, 4);
    }

    @Test
    public void searchInsertTest5() {
        int[] nums = new int[] {1,3,5,6};
        int res = new SearchInsertPosition().searchInsert(nums, -1);
        Assert.assertEquals(res, 0);
    }






}
