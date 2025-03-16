package array.other;

import org.junit.Test;

public class MaxRepeatSubStringTest {
    MaxRepeatSubString solver = new MaxRepeatSubString();

    @Test
    public void testOne() {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        int res = solver.maxRepeating(sequence, word);
        System.out.println(res);
    }
}
