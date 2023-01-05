import org.junit.Test;

import java.util.List;

public class ReadBinaryWatchTest {
    ReadBinaryWatch solver = new ReadBinaryWatch();

    @Test
    public void test1(){
        int turnOn = 1;
        List<String> res = solver.readBinaryWatch(turnOn);
        System.out.println(res);
        // [0:01, 0:02, 0:04, 0:08, 0:16, 0:32, 1:00, 2:00, 4:00, 8:00]
    }

    @Test
    public void test2(){
        int turnOn = 9;
        List<String> res = solver.readBinaryWatch(turnOn);
        System.out.println(res);
        // []
    }

    @Test
    public void test3(){
        int turnOn = 2;
        List<String> res = solver.readBinaryWatch(turnOn);
        System.out.println(res);
        // []
    }
}
