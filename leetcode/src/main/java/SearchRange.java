/**
 * 34 在排序数组中查找元素的第一个和最后一个位置
 */

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int left=0, right=nums.length-1;
        int mid;
        while (left<right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                left = mid;
                break;
            }
            if(nums[mid]<target){
                left = mid+1;
            }else{
                right=mid;
            }
        }

        if(left<nums.length && nums[left]==target) {
            right = left;
            while (left >= 0 && nums[left] == target) {
                left--;
            }
            while (right < nums.length && nums[right] == target) {
                right++;
            }
            res[0] = left + 1;
            res[1] = right - 1;
        }


        return res;
    }
}
