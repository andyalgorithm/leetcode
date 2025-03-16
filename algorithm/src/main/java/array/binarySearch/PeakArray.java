package array.binarySearch;

/**
 * 852. ⼭脉数组的峰顶索引
 */

public class PeakArray {

//    public int peakArray(int[] nums) {
//        if(nums.length<3) {
//            return -1;
//        }
//        int low=0, high=nums.length-1;
//        int mid=-1;
//        while(low<high) {
//            mid = (low+high) >> 1;
//            if(nums[mid]<nums[mid+1]) {
//                low = mid+1;
//            }else {
//                high = mid;
//            }
//        }
//        return low;
//    }

    public int peakArray(int[] nums) {
        if(nums.length<3) {
            return -1;
        }
        int left=0, right=nums.length-1;
        while(left<right) {
            int mid = (left+right)>>1;
            if(nums[mid]<nums[mid+1]) {
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }

}
