package differenceArray;

import org.junit.Assert;
import org.junit.Test;

public class FlightBookingTest {

    private FlightBooking book = new FlightBooking();

    @Test
    public void test1() {
        int[][] bookings = new int[][]{
                {1,2,10},
                {2,3,20},
                {2,5,25}
        };

        int[] res = book.flightBooking(bookings, 5);
        Assert.assertArrayEquals(new int[]{10,55,45,25,25}, res);
    }
}
