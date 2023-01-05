/**
 * 33. 搜索旋转排序数组
 */

public class Search {
    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1;
        int res = -1;
        int mid;
        while (left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[0]<= nums[mid]){
                if(nums[0]<=target && target<nums[mid]){
                    right = mid-1;
                }else{
                    left = mid +1;
                }
            }else{
                if(nums[mid]<target && target<=nums[nums.length-1]){
                    left = mid +1;
                }else{
                    right = mid-1;
                }
            }


        }

        return res;
    }
}
