package differenceArray;

/**
 * 1109. 航班预订统计
 */

public class FlightBooking {

    int[] flightBooking(int[][] bookings, int n) {

        int[] diff = new int[n];

        // 初始化差分数组
        for(int i=0;i<bookings.length;i++) {
            int left = bookings[i][0];
            int right = bookings[i][1];
            int value = bookings[i][2];
            diff[left-1] += value;
            // 在区间范围内的进行操作
            if(right<n) {
                diff[right] -= value;
            }
        }

        // 计算结果
        for(int i=1;i<diff.length;i++) {
            diff[i] += diff[i-1];
        }

        return diff;
    }
}
