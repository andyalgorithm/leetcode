package nSum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. 输入的数据为整形，顺序随机
 * 2.
 */

public class TwoSum {
    public ArrayList<ArrayList<Integer>> twoSum(int[] nums, int target) {
        // 对数组进行排序，默认从小到大排序
        // 如果需要降序，那么添加Collections.reverseOrder()属性
        Arrays.sort(nums);
        int low=0, high=nums.length-1;
//        System.out.println(nums.length); // 4
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        while(low<high) {

            if(nums[low]+nums[high]<target) {
                low++;
            }else if(nums[low]+nums[high]>target) {
                high--;

                // 相等时存储
            }else {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[low]);
                temp.add(nums[high]);
                list.add(temp);
                int origin = nums[low];
                low++;
                while(origin == nums[low] && low<high) {
                    low++;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = new int[] {1,3,5,2};
       ArrayList<ArrayList<Integer>> res = solution.twoSum(nums, 5);
        for(int i=0;i<res.size();i++) {
            System.out.print("[");
            for(int j=0;j<res.get(i).size();j++) {
                System.out.print(res.get(i).get(j)+" ");
            }
            System.out.print("]\t");
        }
        System.out.println();
    }

}



