import org.junit.Test;

public class MinMeetingRoomsTest {
    MinMeetingRooms solver = new MinMeetingRooms();

    @Test
    public void test1(){
        int[][] intervals = {{0,30},{5,10},{15,20}};
        int res = solver.minMeetingRooms(intervals);
        System.out.println(res);
    }
}
