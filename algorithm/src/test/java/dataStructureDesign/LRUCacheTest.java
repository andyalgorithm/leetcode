package dataStructureDesign;

import org.junit.Test;

public class LRUCacheTest {

    LRUCache solver = new LRUCache(2);

    @Test
    public void testOne() {
        solver.put(1,1);
        solver.put(2,2);
        System.out.println(solver.get(1)); // 1
        solver.put(3,3);
        System.out.println(solver.get(2)); // -1
        solver.put(4,4);
        System.out.println(solver.get(1)); // -1
        System.out.println(solver.get(3)); // 3
        System.out.println(solver.get(4)); // 4
    }

    @Test
    public void testTwo() {
        solver.put(1,1);
        solver.put(2,2);
        System.out.println(solver.get(1)); // 1
        solver.put(3,3);
        System.out.println(solver.get(2)); // -1
        solver.put(4,4);
        System.out.println(solver.get(1)); // -1
        System.out.println(solver.get(3)); // 3
        System.out.println(solver.get(4)); // 4
    }
}
