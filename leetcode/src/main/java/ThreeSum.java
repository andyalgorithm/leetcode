import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 15 三数之和
 */

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 从小到大排序
        Arrays.sort(nums);
//        dp(nums, 0, 3, 0, new ArrayList<Integer>(), res);
        return res;
    }

    void dp(int[] nums, int target, int n, int start, ArrayList<Integer> t, List<List<Integer>> res){
//        if(target==0 && t.size()==n){
//            res.add(new ArrayList<>(t));
//
//        }
//        if(start<2 || start>= nums.length){
//            return;
//        }
//        if
    }
}
