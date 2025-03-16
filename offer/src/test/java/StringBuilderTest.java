import org.junit.Test;

public class StringBuilderTest {
    StringBuilder solver = new StringBuilder();

    @Test
    public void testOne() {
        solver.insert(0, '1');
        solver.insert(0, '2');
        System.out.println(solver); // 21
    }

    @Test
    public void testTwo() {
        solver.insert(0, 11);
        solver.insert(0, 12);
        System.out.println(solver); // 1211
    }
}
