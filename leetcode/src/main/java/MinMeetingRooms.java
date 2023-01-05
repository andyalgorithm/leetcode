import java.util.Arrays;

/**
 * 253. 会议室II
 */
public class MinMeetingRooms {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[0]-b[0];
        });

        int res = 1;


        return res;
    }


}
