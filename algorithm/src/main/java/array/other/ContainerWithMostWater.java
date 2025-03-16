package array.other;

/**
 * 11 盛最多水的容器
 */

public class ContainerWithMostWater {

    int containerWithMOstWater(int[] nums) {
        int res = 0;
        if(nums.length<2) {
            return res;
        }

        int left=0, right=nums.length-1;
        while (left<right) {
            int capacity = waterCapacity(left, right, nums);
            res = Math.max(res, capacity);
            if(nums[left]<=nums[right]) {
                left++;
            }else{
                right--;
            }
        }

        return res;

    }

    int waterCapacity(int left, int right, int[] nums) {
        return Math.min(nums[left], nums[right]) * (right-left);
    }
}
