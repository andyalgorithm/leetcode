package backTrack;

import org.junit.Test;

import java.util.ArrayList;

public class NQueuesTest {

    NQueues solver = new NQueues();

    @Test
    public void testOne() {
        ArrayList<ArrayList<String>> res = solver.nQueues(4);
        for(ArrayList<String> ls: res) {
            for(String s: ls) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
    /**
     * .Q..
     * ...Q
     * Q...
     * ..Q.
     *
     * ..Q.
     * Q...
     * ...Q
     * .Q..
     */
}
