package array.binarySearch;

/**
 * 35. 搜索插⼊位置
 */

public class SearchInsertPosition {

    /**
     * 最初写法
     */
//    public int searchInsert(int[] nums, int target) {
//        // 处理边界问题
//        if(nums.length==0 || nums[0]>target) {
//            return 0;
//        }
//        if(nums[nums.length-1]<target) {
//            return nums.length;
//        }

//        int low=0, high=nums.length-1;
//        int mid=0;
//        while(low<high) {
//             mid = (low+high)>>1;
//            if(nums[mid]>target) {
//                high = mid-1;
//            }else if(nums[mid]<target) {
//                low = mid+1;
//            }else {
//                while(mid>0 && nums[mid-1]==target) {
//                    mid--;
//                }
//                return mid;
//            }
//        }
//        return mid;
//    }

    /**
     * 按照模板写法
     */
    public int searchInsert(int[] nums, int target) {
        // 对参数进行处理
        if(nums.length==0 || nums[0]>target) {
            return 0;
        }
        if(nums[nums.length-1]<target) {
            return nums.length;
        }

        int left=0, right=nums.length-1;

        while(left<right) {
            int mid=0;
             mid = (left+right)>>1;
            if(nums[mid]<target) {
                left = mid+1;
            }else {
                right = mid;
            }
        }

        // 对结果进行处理
        while(left>0 && nums[left-1]==target) {
            left--;
        }
        return left;
    }


}
