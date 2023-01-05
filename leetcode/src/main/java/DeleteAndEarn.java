import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 740. 删除并获得点数
 */

public class DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        int res = 0;
        int maxVal = 0;
        for(int t: nums){
            maxVal = Math.max(maxVal, t);
        }

        int[] values = new int[maxVal+1];

        int[] memo = new int[maxVal+1];
        Arrays.fill(memo, -1);

        for(int n: nums){
            values[n] += n;
        }

        res = dp(maxVal, values, memo);

        return res;
    }

    int dp(int start, int[] values, int[] memo){
        if(start<0){
            return 0;
        }
        if(memo[start]!=-1){
            return memo[start];
        }
        memo[start] = Math.max(dp(start-1, values, memo),
                dp(start-2, values, memo)+values[start]);
        return memo[start];
    }



}
