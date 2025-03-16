package nSum;

import java.util.ArrayList;
import java.util.Arrays;

public class NSum {

    ArrayList<ArrayList<Integer>> nSum(int[] nums, int target, int N) {
        Arrays.sort(nums);
        return nSumHelper(nums, target, N, 0);
    }

    // 在这里，N大于2
    ArrayList<ArrayList<Integer>> nSumHelper(int[] nums, int target, int N, int start){
        // 小于两个数相加 或者 起点到终点的元素个数小于N
        if(N<2 || start+N>nums.length) {
            return new ArrayList<ArrayList<Integer>>();
        }
        else if(N==2) {
            int low=start, high=nums.length-1;
            ArrayList<ArrayList<Integer>> twoRes = new ArrayList<ArrayList<Integer>>();
            while(low<high) {
                if(nums[low]+nums[high]<target) {
                    low++;
                }else if(nums[low]+nums[high]>target) {
                    high--;
                }else {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    twoRes.add(temp);
                    int origin = nums[low];
                    low++;
                    while(origin==nums[low] && low<high) {
                        low++;
                    }
                }
            }
            return twoRes;
        }else {
            ArrayList<ArrayList<Integer>> part = nSumHelper(nums, target - nums[start], N - 1, start+1);
            if (part.size() > 0) {
                for (ArrayList<Integer> integers : part) {
                    integers.add(0, nums[start]);
                }
            }
            return part;

            }
    }


}
