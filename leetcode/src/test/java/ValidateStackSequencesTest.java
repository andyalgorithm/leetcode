import org.junit.Test;

public class ValidateStackSequencesTest {
    ValidateStackSequences solver = new ValidateStackSequences();

    @Test
    public void test1(){
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        boolean res = solver.validateStackSequences(pushed, popped);
        System.out.println(res);
        // true
    }

    @Test
    public void test2(){
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        boolean res = solver.validateStackSequences(pushed, popped);
        System.out.println(res);
        // false
    }

    @Test
    public void test3(){
        int[] pushed = {0,2,1};
        int[] popped = {0,1,2};
        boolean res = solver.validateStackSequences(pushed, popped);
        System.out.println(res);
        // true
    }
}
