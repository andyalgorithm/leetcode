import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MultiplyTest {
    Multiply solver = new Multiply();


    @Test
    public void test1(){
        String num1 = "2";
        String num2 = "3";
        String res = solver.multiply(num1, num2);
        System.out.println(res);
        // 6
    }

    @Test
    public void test2(){
        String num1 = "123";
        String num2 = "456";
        String res = solver.multiply(num1, num2);
        System.out.println(res);
        // 56088
    }

    @Test
    public void test3(){

        String num1 = "";
        String num2 = "";
        String res = solver.multiply(num1, num2);
        System.out.println(res);
        // 0
    }

    @Test
    public void test4(){
        String num1 = "999";
        String num2 = "999";
        String res = solver.multiply(num1, num2);
        System.out.println(res);
        // 998001
    }

    @Test
    public void test(){
        int[] nums = {1,2,3};
        nums = new int[nums.length+1];
        System.out.println(Arrays.toString(nums));
    }
}
