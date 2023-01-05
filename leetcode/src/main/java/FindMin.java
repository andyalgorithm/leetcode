/**
 * 154. 寻找旋转排序数组中的最小值
 */

public class FindMin {
    public int findMin(int[] nums) {
        int res = nums[0];
        int left=0, right=nums.length-1;
        int mid;
        while (left<right){
            mid = (left+right)/2;
            if(nums[mid]==nums[left]){
                left++;
            }else if(nums[left]>nums[mid]){
                right=mid;
            }else{
                left=mid+1;
            }
            res = Math.min(res, nums[left]);
        }

        if(nums[left]<res){
            res = nums[left];
        }

        return res;
    }
}
