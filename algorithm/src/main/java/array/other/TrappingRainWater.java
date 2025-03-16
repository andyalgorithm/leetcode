package array.other;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 *  42 接雨水
 */

public class TrappingRainWater {

    int trappingRainWater(int[] nums) {
        int res = 0;
        if(nums.length<2) {
            return res;
        }

        int[] leftHeight = new int[nums.length];
        int[] rightHeight = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(i==0) {
                leftHeight[i] = nums[i];
            } else {
                leftHeight[i] = Math.max(nums[i], leftHeight[i-1]);
            }
        }

        for(int i=nums.length-1; i>=0;i--) {
            if(i==nums.length-1) {
                rightHeight[i] = nums[i];
            } else {
                rightHeight[i] = Math.max(nums[i], rightHeight[i+1]);
            }
        }
        
        for(int i=0; i<nums.length;i++) {
            int height = Math.min(leftHeight[i], rightHeight[i]);
            res = res + (height-nums[i]);
        }


        return res;
    }

}
