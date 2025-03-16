import java.util.Arrays;

/**
 * 009/713 乘积小于K的子数组
 */


public class NumSubArrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int low=0, high=0;

        while (low<nums.length) {
            int left = nums[low];
            int sum = 1;
            high = low;
            while(high<nums.length) {
                sum = sum*nums[high];
                if(sum>=k) {
                    break;
                }
                high++;
                res++;
            }
            low++;
        }
        return res;

    }

}
