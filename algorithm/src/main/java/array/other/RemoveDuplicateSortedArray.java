package array.other;

/**
 * 26 删除有序数组中的重复项
 */

public class RemoveDuplicateSortedArray {

    public void removeDuplicateSortedArray(int[] nums){
        // 若数组的长度小于2，那么不用处理
        if(nums.length<2) {
            return;
        }

        int left=0, right=1;
        while(right<nums.length) {
            if(nums[left]!=nums[right]) {
                left++;
                nums[left]=nums[right];
            }
            right++;
        }

        // 对于left右侧的数据均置为0
        for(int i=left+1; i<right;i++) {
            nums[i] = 0;
        }
    }
}
