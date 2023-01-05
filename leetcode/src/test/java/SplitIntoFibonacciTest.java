import org.junit.Test;

import java.util.List;

public class SplitIntoFibonacciTest {
    SplitIntoFibonacci solver = new SplitIntoFibonacci();

    @Test
    public void test1(){
        String num = "1101111";
        List<Integer> res = solver.splitIntoFibonacci(num);
        System.out.println(res);
        // [11, 0, 11, 11]
    }

    @Test
    public void test2(){
        String num = "112358130";
        List<Integer> res = solver.splitIntoFibonacci(num);
        System.out.println(res);
        // []
    }

    @Test
    public void test3(){
        String num = "0123";
        List<Integer> res = solver.splitIntoFibonacci(num);
        System.out.println(res);
        // []
    }


    @Test
    public void test4(){
        String num = "123456579";
        List<Integer> res = solver.splitIntoFibonacci(num);
        System.out.println(res);
        // [123,456,579]
    }

    @Test
    public void test5(){
        String num = "0000";
        List<Integer> res = solver.splitIntoFibonacci(num);
        System.out.println(res);
        // [0, 0, 0, 0]
    }

//    @Test
    public void test(){
        String s1 = "123";
        String s2 = "1234";
        String max = "2147483647";
        System.out.println(s1.compareTo(s2)); // -1
        System.out.println(max.compareTo(s1)); // 1
        System.out.println(max.compareTo(s2)); // 1
        System.out.println(max.compareTo(max)); // 0
        System.out.println(max.compareTo("2147483648")); // -1
        System.out.println(max.compareTo("34")); // -1
    }
}
