/**
 * 81. 搜素旋转排序数组II
 */

public class SearchII {
    public boolean search(int[] nums, int target) {
//        if(nums.length==1){
//            return nums[0]==target;
//        }

        int left=0, right=nums.length-1;
        int mid;

        while(left<right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]<target){
                if(nums[left]==nums[mid]){
                    left++;
                }else if(nums[left]<nums[mid]){
                    left=mid+1;
                }else{
                    if(nums[right]>=target){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
                }
            }else{
                if(nums[right]==nums[mid]){
                    right--;
                }else if(nums[right]>nums[mid]){
                    right=mid-1;
                }else{
                    if(nums[left]<=target){
                        right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }
            }
        }

        return nums[left]==target;
    }
}
