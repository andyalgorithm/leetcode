package DP;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 354. 俄罗斯套娃信封问题
 *
 * 思路：对信封进行排序。先比较width，width相同则比较height
 */

public class Envelops {

    public int maxEnvelops(int[][] envelops) {
        int res = 0;
        // 对二维数组进行排序
        Arrays.sort(envelops, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if(a[0]==b[0]) {
                    return a[1]-b[1];
                }
                return a[0]-b[0];
            }
        });

        return res;
    }
}
