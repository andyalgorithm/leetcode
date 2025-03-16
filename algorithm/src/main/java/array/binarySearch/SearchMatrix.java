package array.binarySearch;

/**
 * 74. 搜索⼆维矩阵
 */

public class SearchMatrix {

    /**
     * 最初算法
     */
//    public boolean searchMatrix(int[][] nums, int target) {
//
//        if(nums.length==0 || nums[0].length==0) {
//            return false;
//        }
//
//        if(nums[0][0]>target || nums[nums.length-1][nums[0].length-1]<target) {
//            return false;
//        }
//
//        if(nums[nums.length-1][nums[0].length-1]==target) {
//            return true;
//        }
//
//        int M = nums.length;
//        int N = nums[0].length;
//        boolean res=false;
//        int low, high, mid=0;
//        low = 0;
//        high = M*N-1;
//
//        while(low<high) {
//            mid = (low+high)>>1;
//            int m = mid/N;
//            int n = mid%N;
//            if(nums[m][n]<target) {
//                low = mid+1;
//            }else if(nums[m][n]>target) {
//                high = mid-1;
//            }else {
//                res = true;
//                break;
//            }
//        }
//        if(low==high && nums[low/N][low%N]==target) {
//            res = true;
//        }
//        return res;
//    }

    /**
     * 使用框架算法
     */
    public boolean searchMatrix(int[][] nums, int target) {

        // 参数处理
        if(nums.length==0 || nums[0].length==0) {
            return false;
        }
        if(nums[0][0]>target || nums[nums.length-1][nums[0].length-1]<target) {
            return false;
        }
        if(nums[nums.length-1][nums[0].length-1]==target) {
            return true;
        }

        int M = nums.length;
        int N = nums[0].length;
        int left=0, right=M*N-1;

        while(left<right) {
            int mid = (left+right)>>1;
            int m = mid/N;
            int n = mid%N;
            if(nums[m][n]<target) {
                left = mid+1;
            }else{
                right = mid;
            }
        }

        if(nums[left/N][left%N]==target) {
            return true;
        }
        return false;
    }
}
