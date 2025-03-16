import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 007/15 数组中和为0的三个数
 */

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // 先从小到大排序
        Arrays.sort(nums);
        int p = 0;
        while(p<nums.length) {
            int left = nums[p];
            List<List<Integer>> temp = twoSum(nums, p+1, -left);
            for(List<Integer> t: temp) {
                t.add(left);
                res.add(t);
            }
            while(p<nums.length && left==nums[p]) {
                p++;
            }
        }
        return res;
    }

    List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int low=start, high=nums.length-1;
        while(low<high) {
            int left = nums[low];
            int right = nums[high];
            int sum = left+right;
            if(sum==target) {
                List<Integer> temp = new ArrayList<>();
                temp.add(left);
                temp.add(right);
                res.add(temp);
                while(low<high && left==nums[low]) {
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
        return res;
    }

}
