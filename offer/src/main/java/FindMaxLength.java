import java.util.Arrays;
import java.util.HashMap;

/**
 * 011/525 0和1个数相同的子数组
 */

public class FindMaxLength {
    public int findMaxLength(int[] nums) {
        int res = 0;
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // 在默认索引从-1开始

        for(int i=0; i<nums.length; i++) {
            // 求前缀和。将0设置为-1
            if(nums[i]==0) {
                count--;
            }else {
                count++;
            }

            // 若相等，那么表明存储的索引与当前索引的和为0
            if(map.containsKey(count)) {
                res = Math.max(res, i-map.get(count));
            }else {
                map.put(count, i);
            }

        }

        return res;
    }


}
