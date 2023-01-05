import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 56. 合并区间
 */

public class MergeIntervalsII {
    public int[][] merge(int[][] intervals) {
        // 从小到大排序
        LinkedList<int[]> ll = new LinkedList<>();
        Arrays.sort(intervals, (a,b) -> {
            return a[0]-b[0];
        });

        int left=intervals[0][0], right=intervals[0][1];
        for(int[] t: intervals){
            if(t[0]<=left && left<=t[1]){
                left = t[0];
            }
            if(t[0]<=right && right<=t[1]){
                right = t[1];
            }
            if(t[0]>right || left>t[1]){
                ll.add(new int[]{left, right});
                left = t[0];
                right = t[1];
            }
        }
        ll.add(new int[]{left, right});

        int[][] res = new int[ll.size()][2];
        for(int i=0; i<ll.size(); i++){
            res[i] = ll.get(i);
        }
        return res;
    }
}
