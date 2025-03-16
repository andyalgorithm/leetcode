package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * 74. 搜索⼆维矩阵
 */

public class SearchMatrixTest {

//    @Test
    public void searchMatrixTest1() {
        int[][] nums = new int[][] {{}};
        boolean res = new SearchMatrix().searchMatrix(nums, 3);
        Assert.assertFalse(res);
    }

    @Test
    public void searchMatrixTest2() {
        int[][] nums = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res = new SearchMatrix().searchMatrix(nums, 3);
        Assert.assertTrue(res);
    }

    @Test
    public void searchMatrixTest3() {
        int[][] nums = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res = new SearchMatrix().searchMatrix(nums, 0);
        Assert.assertFalse(res);
    }

    @Test
    public void searchMatrixTest4() {
        int[][] nums = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res = new SearchMatrix().searchMatrix(nums, 60);
        Assert.assertTrue(res);
    }

    @Test
    public void searchMatrixTest5() {
        int[][] nums = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res = new SearchMatrix().searchMatrix(nums, 61);
        Assert.assertFalse(res);
    }

    @Test
    public void searchMatrixTest6() {
        int[][] nums = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res = new SearchMatrix().searchMatrix(nums, 11);
        Assert.assertTrue(res);
    }
}
