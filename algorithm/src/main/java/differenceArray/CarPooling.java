package differenceArray;

/**
 * 1094. 拼车
 * 公交站台数量不多于1000个
 */

public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {
        if(trips.length==0) {
            return true;
        }
        boolean res = true;

        // 初始化差分数组
        int[] diff = new int[1001];

        // 对差分数组进行操作
        for(int i=0;i<trips.length;i++) {
            int left = trips[i][1];
            int right = trips[i][2];
            int value = trips[i][0];
            diff[left] += value;
            diff[right+1] -= value;
        }

        // 计算结果数组
        for(int i=1;i<diff.length;i++) {
            diff[i] += diff[i-1];
            if(diff[i]>capacity) {
                res = false;
                break;
            }
        }
        return res;
    }
}
