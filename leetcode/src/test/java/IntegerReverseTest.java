import org.junit.Test;

public class IntegerReverseTest {
    IntegerReverse solver = new IntegerReverse();

    @Test
    public void test1(){
        int num = -123;
        while (num!=0) {
            int mod = num%10;
            num /= 10;
            System.out.println(mod+", "+num);
            /**
             * -3, -12
             * -2, -1
             * -1, 0
             */
        }
    }

    @Test
    public void test2(){
        int x = 123;
        int res = solver.reverse(x);
        System.out.println(x);
    }

    @Test
    public void test3(){
        int x = -123;
        int res = solver.reverse(x);
        System.out.println(res);
        // -321
    }

    @Test
    public void test4(){
        int x = 120;
        int res = solver.reverse(x);
        System.out.println(res);
        // 21
    }

    @Test
    public void test5(){
        int x = 0;
        int res = solver.reverse(x);
        System.out.println(res);
        // 0
    }
}
