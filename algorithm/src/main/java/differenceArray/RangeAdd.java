package differenceArray;

/**
 * 370. 区间加法
 */

public class RangeAdd {

    public int[] rangeAdd(int[][] updates, int length) {
        int[] diff = new int[length];

        // 差分数组初始化
        for(int i=0;i<updates.length;i++) {
            int left = updates[i][0];
            int right = updates[i][1];
            int value = updates[i][2];
            diff[left] += value;
            if(right+1<diff.length) {
                diff[right+1] -= value;
            }
        }

        for(int i=1;i<diff.length;i++) {
            diff[i] += diff[i-1];
        }


        // 计算结果



        return diff;
    }
}


