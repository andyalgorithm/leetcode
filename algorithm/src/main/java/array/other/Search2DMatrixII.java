package array.other;

/**
 *  240. 搜索二维矩阵II
 */

public class Search2DMatrixII {

    public boolean search2DMatrixII(int[][] nums, int target) {
        boolean res = false;
        int i=0, j=nums[0].length-1;
        while(i<nums.length && j>=0) {
            if(nums[i][j]==target) {
                res = true;
                break;
            } else if(nums[i][j]>target) {
                j--;
            } else {
                i++;
            }

        }
        return res;

    }
}
