import java.util.LinkedList;
import java.util.Stack;

/**
 *  57. 插入区间
 */

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> ll = new LinkedList<>();
        int left=newInterval[0], right=newInterval[1];
        boolean placed = false;

        for(int[] t: intervals){
            if(!placed){
                if(right<t[0]){
                    ll.add(new int[]{left, right});
                    placed = true;
                }
                if((t[0]<=left && left<=t[1]) || (t[0]<=right && right<=t[1])) {
                    left = Math.min(left, t[0]);
                    right = Math.max(right, t[1]);
                }else if(t[1]<left || t[0]>right){
                    ll.add(t);
                }
            }else{
                ll.add(t);
            }
        }

        if(!placed){
            ll.add(new int[]{left, right});
        }

        int[][] res = new int[ll.size()][2];
        for(int i=0; i<ll.size(); i++){
            res[i] = ll.get(i);
        }
        return res;
    }
}
