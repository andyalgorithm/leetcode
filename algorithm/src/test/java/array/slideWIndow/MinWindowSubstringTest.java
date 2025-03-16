package array.slideWIndow;

import org.junit.Assert;
import org.junit.Test;
import array.slideWindow.MinWindowSubstring;

public class MinWindowSubstringTest {
    private MinWindowSubstring min = new MinWindowSubstring();

    @Test
    public void minWindowSubstringTest1() {
        String s = "ADOBECODEBANC", t = "ABC";
        String res = min.minWindowSubstring(s, t);
        Assert.assertEquals("BANC", res);
    }

    @Test
    public void minWindowSubstringTest2() {
        String s = "a", t = "a";
        String res = min.minWindowSubstring(s, t);
        Assert.assertEquals("a", res);
    }

    @Test
    public void minWindowSubstringTest3() {
        String s = "a", t = "aa";
        String res = min.minWindowSubstring(s, t);
        Assert.assertEquals("", res);
    }
}
