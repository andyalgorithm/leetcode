package nSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    // 规定遍历的起点，防止出现重复计算
    // 在这里假设已经排号序了，从小到大
    private ArrayList<ArrayList<Integer>> twoSum(int[] nums, int target, int start) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int low = start;
        int high = nums.length-1;
        while(low<high) {
            if(nums[low]+nums[high]<target) {
                low++;
            }else if(nums[low]+nums[high]>target) {
                high--;
            }else {
                ArrayList<Integer> tempList = new ArrayList<Integer>();
                tempList.add(nums[low]);
                tempList.add(nums[high]);
                res.add(tempList);
                int temp = nums[low];
                low++;
                while(temp==nums[low] && low<high) {
                    low++;
                }
            }
        }
        return res;
    }

    ArrayList<ArrayList<Integer>> threeSum(int[] nums, int target){
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<nums.length;i++) {

            ArrayList<ArrayList<Integer>> part = twoSum(nums, target-nums[i], i+1);
            if(part.size()>0) {
                for(int j=0;i<part.size();i++){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    part.get(j).add(0, nums[i]);
                    res.add(part.get(j));
                }
            }
        }
        return res;
    }
}
