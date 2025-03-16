package array.binarySearch;

/**
 * 704. ⼆分查找
 * 难度:简单
 * 解题：略
 */

public class SearchPosition {

    public int search(int[] nums, int target) {
        // 异常的处理
        if(nums.length<1) {
            return -1;
        }

        int left=0, right=nums.length-1;
        while(left<right) {
            int mid = (left+right) >> 1;
            if(nums[mid]<target) {
                left = mid+1;
            }else {
                right = mid;
            }
        }
        // 异常情况的处理
        if (nums[left]!=target)
            return -1;


        return left;
    }
}
