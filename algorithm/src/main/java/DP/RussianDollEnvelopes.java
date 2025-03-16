package DP;

import java.util.Arrays;
import java.util.Comparator;

public class RussianDollEnvelopes {

    public int russianDollEnvelopes(int[][] envelopes) {
        int[] memo = new int[envelopes.length];
        memo[0] = 1;

        // 排序
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) {
                    return o1[1]-o2[1];
                }else {
                    return o2[1]-o1[1];
                }
            }
        });

//        dp(envelopes.length-1, envelopes, memo);

        return memo[envelopes.length-1];
    }

//    int dp(int start, int[][] envelopes, int[] memo) {
//        if(start==0) {
//            return 1;
//        }
//
//        if(envelopes[start][0]>envelopes[start-1][0] && envelopes[start][1]>envelopes[start-1][1]) {
//            if(memo[start-1]==0) {
//                memo[start-1] = dp(start-1, envelopes, memo);
//            }
//            memo[start]=memo[start-1]+1;
//        }else{
////            dp
//        }
//    }


}
