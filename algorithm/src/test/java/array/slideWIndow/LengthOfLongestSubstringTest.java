package array.slideWIndow;

/**
 * 3. 无重复字符的最长子串
 */

import org.junit.Assert;
import org.junit.Test;
import array.slideWindow.LengthOfLongestSubstring;

public class LengthOfLongestSubstringTest {

    private LengthOfLongestSubstring len = new LengthOfLongestSubstring();

    @Test
    public void test1() {
        String s = new String("abcabcbb");
        Assert.assertEquals(3, len.lengthOfLongestSubstring(s));
    }

    @Test
    public void test2() {
        String s = new String("bbbbb");
        Assert.assertEquals(1, len.lengthOfLongestSubstring(s));
    }

    @Test
    public void test3() {
        String s = new String("pwwkew");
        Assert.assertEquals(3, len.lengthOfLongestSubstring(s));
    }
}
