import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 007/15 数组中和为0的三个数
 * labuladong 利用递归求解
 */

public class ThreeSumII {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // 先从小到大排序
        Arrays.sort(nums);

        res = dp(nums, 0, 3, 0);

        return res;
    }

    /**
     *
     * @param nums 数组
     * @param start 遍历的起始点
     * @param n 相加的数字个数
     * @param target 目标和
     * @return
     */
    List<List<Integer>> dp(int[] nums, int start, int n, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(n<2 || start>=nums.length) {
            return res;
        }

        if(n==2) {
            int low = start, high=nums.length-1;
            while(low<high) {
                int left=nums[low];
                int right = nums[high];
                int sum = left+right;
                if(sum==target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(left);
                    temp.add(right);
                    res.add(temp);
                    while (low<high && left==nums[low]) {
                        low++;
                    }
                }else if(sum<target) {
                    while(low<high && left==nums[low]) {
                        low++;
                    }
                }else {
                    while(low<high && right==nums[high]) {
                        high--;
                    }
                }
            }
        }else {
            int p=start;
            while(p<nums.length) {
                int left = nums[p];
                List<List<Integer>> temp = dp(nums, p+1, n-1, target-nums[p]);
                for(List<Integer> t: temp) {
                    t.add(nums[p]);
                    res.add(t);
                }
                while(p<nums.length && left==nums[p]) {
                    p++;
                }
            }
        }
        return res;
    }



}
