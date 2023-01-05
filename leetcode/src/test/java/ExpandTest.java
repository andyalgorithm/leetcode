import org.junit.Test;

import java.util.Arrays;

public class ExpandTest {
    Expand solver = new Expand();

    @Test
    public void test1(){
        String s = "{a,b}c{d,e}f";
        String[] res = solver.expand(s);
        System.out.println(Arrays.toString(res));
        // [acdf, acef, bcdf, bcef]
    }

    @Test
    public void test2(){
        String s = "abcd";
        String[] res = solver.expand(s);
        System.out.println(Arrays.toString(res));
        // [abcd]
    }

    @Test
    public void test3(){
        String s = "{a,b}{z,x,y}";
        String[] res = solver.expand(s);
        System.out.println(Arrays.toString(res));
        // [ax, ay, az, bx, by, bz]
    }
}
