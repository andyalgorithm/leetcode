import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  39. 数组总和
 */

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // 从小到大排序
        dp(0, candidates, target, new ArrayList<Integer>(), res);

        return res;
    }

    void dp(int start, int[] candidates, int target, ArrayList<Integer> temp, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(temp));
        }else if(target<0){
            return;
        }
        for(int i=start; i<candidates.length; i++){
            // 枝剪去重
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            temp.add(candidates[i]);
            dp(i+1, candidates, target-candidates[i], temp, res);
            temp.remove(temp.size()-1);
        }
    }
}
