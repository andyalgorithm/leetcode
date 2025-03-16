package binaryTree;

import org.junit.Test;

public class IntegerTest {

    void change(Integer i) {
        i = 21;
    }

    @Test
    public void testOne() {
        Integer i = 10;
        change(i);
        System.out.println(i);
        // 10, i并没有改变
    }
}
