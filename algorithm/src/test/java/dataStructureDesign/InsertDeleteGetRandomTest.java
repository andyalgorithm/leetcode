package dataStructureDesign;

import org.junit.Test;

public class InsertDeleteGetRandomTest {

    InsertDeleteGetRandom solver = new InsertDeleteGetRandom();

    @Test
    public void testOne() {
        System.out.println(solver.insert(1)); // true
        System.out.println(solver.remove(2)); // false
        System.out.println(solver.insert(2)); // true
        System.out.println(solver.getRandom()); // 2
        System.out.println(solver.remove(1)); // true
        System.out.println(solver.insert(2)); // false
        System.out.println(solver.getRandom()); // 1
    }
}
