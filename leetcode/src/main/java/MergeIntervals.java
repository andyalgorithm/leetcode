import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 56. 合并区间
 */

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        // 从小到大排序
        LinkedList<LinkedList<Integer>> ll = new LinkedList<>();
        Arrays.sort(intervals, (a,b) -> {
            return a[0]-b[0];
        });

        Stack<Integer> stack = new Stack<>();
        stack.push(intervals[0][0]);
        stack.push(intervals[0][1]);
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]<=stack.peek()){
                int t = stack.pop();
                stack.push(Math.max(t, intervals[i][1]));
            }else{
                LinkedList<Integer> temp = new LinkedList<>();
                temp.addFirst(stack.pop());
                temp.addFirst(stack.pop());
                ll.add(temp);
                stack.push(intervals[i][0]);
                stack.push(intervals[i][1]);
            }
        }
        LinkedList<Integer> temp = new LinkedList<>();
        temp.addFirst(stack.pop());
        temp.addFirst(stack.pop());
        ll.add(temp);

        int[][] res = new int[ll.size()][2];
        for(int i=0; i<ll.size(); i++){
            res[i][0] = ll.get(i).get(0);
            res[i][1] = ll.get(i).get(1);
        }
        return res;
    }
}
