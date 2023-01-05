import java.util.ArrayList;
import java.util.List;

/**
 *  39. 数组总和
 */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
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
            temp.add(candidates[i]);
            dp(i, candidates, target-candidates[i], temp, res);
            temp.remove(temp.size()-1);
        }
    }
}
