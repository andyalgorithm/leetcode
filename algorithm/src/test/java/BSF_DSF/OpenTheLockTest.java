package BSF_DSF;

import BFS_DFS.OpenTheLock;
import org.junit.Test;

import java.util.ArrayList;

public class OpenTheLockTest {

    OpenTheLock solver = new OpenTheLock();

    @Test
    public void testOne() {
        ArrayList<String> depends = new ArrayList<>();
        depends.add("0201");
        depends.add("0101");
        depends.add("0102");
        depends.add("1212");
        depends.add("2002");
        String target = "0202";

        int res = solver.openTheLock(depends, target);
        System.out.println(res);
        /**
         * 6
         */

    }

    @Test
    public void testTwo() {
        ArrayList<String> depends = new ArrayList<>();
        depends.add("8887");
        depends.add("8889");
        depends.add("8878");
        depends.add("8898");
        depends.add("8788");
        depends.add("8988");
        depends.add("7888");
        depends.add("9888");
        String target = "8888";

        int res = solver.openTheLock(depends, target);
        System.out.println(res);
        /**
         *  -1
         */

    }
}
