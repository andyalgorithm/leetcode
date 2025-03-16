/**
 * 006/167 排序数组中两个数字之和
 */

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left=0, right=numbers.length-1;

        while(left<right) {
            int sum = numbers[left]+numbers[right];
            if(sum==target) {
                break;
            }
            if(sum>target) {
                right--;
            }else {
                left++;
            }
        }
        res[0] = left;
        res[1] = right;
        return res;
    }
}
