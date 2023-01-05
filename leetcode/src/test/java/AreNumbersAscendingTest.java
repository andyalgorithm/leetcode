import org.junit.Test;

public class AreNumbersAscendingTest {

    AreNumbersAscending solver = new AreNumbersAscending();

    @Test
    public void test1(){
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        boolean res = solver.areNumbersAscending(s);
        System.out.println(res);
        // true
    }

    @Test
    public void test2(){
        String s = "hello world 5 x 5";
        boolean res = solver.areNumbersAscending(s);
        System.out.println(res);
        // false
    }

    @Test
    public void test3(){
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        boolean res = solver.areNumbersAscending(s);
        System.out.println(res);
        // false
    }

    @Test
    public void test4(){
        String s = "4 5 11 26";
        boolean res = solver.areNumbersAscending(s);
        System.out.println(res);
        // true
    }
}
