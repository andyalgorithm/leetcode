package array.binarySearch;

/**
 * 34. 在排序数组中查找元素的第⼀个和最后⼀个位置
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        /**
         * 给定值target，查询在有序数组中的位置
         */

        int[] res = new int[] {-1,-1};
        int low,mid, high;
        boolean rangeFound;
        rangeFound = false;
        low = 0;
        high = nums.length-1;

        while(low<high) {
            if(rangeFound) {
                return res;
            }
            mid = (low+high)>>1;
            if(nums[mid]<target) {
                low = mid+1;
            }else if(nums[mid]>target) {
                high = mid-1;
            }else {
                // 找到目标值
                int tLeft = mid;
                int tRight = mid;
                // 向左边遍历，取左边界
                while(tLeft>0 && nums[tLeft-1]==target) {
                    tLeft--;
                }

                // 向右边遍历，取右边界
                while(tRight+1<nums.length && nums[tRight+1]==target) {
                    tRight++;
                }


                res[0] = tLeft;
                res[1] = tRight;
                rangeFound = true;
            }
        }

        return res;
    }

}
