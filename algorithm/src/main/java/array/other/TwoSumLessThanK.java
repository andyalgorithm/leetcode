package array.other;

import java.util.Arrays;

/**
 * 1099 小于K的两数之和
 */

public class TwoSumLessThanK {

    public int twoSumLessThanK(int[] nums, int k) {
        int res = -1;
        // 对数组排序
        Arrays.sort(nums);

        int left = 0, right=nums.length-1;

        while(left<right) {
            int temp = nums[left]+nums[right];
            if(temp<k) {
                res = Math.max(res, temp);
                left++;
            }else{
                right--;
            }
        }

        return res;
    }
}
