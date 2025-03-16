package array.slideWIndow;

import org.junit.Assert;
import org.junit.Test;
import array.slideWindow.FindAnagrams;

import java.util.List;

public class FindAnagramsTest {

    private FindAnagrams anagrams = new FindAnagrams();

    @Test
    public void findAnagrams1() {
        String s = "cbaebabacd", p = "abc";
        int[] expect = new int[] {0, 6};
        List<Integer> resArray = anagrams.findAnagrams(s, p);
        int[] res = new int[resArray.size()];

        for(int i=0;i<resArray.size();i++) {
            res[i] = resArray.get(i);
        }
        Assert.assertArrayEquals(expect, res);
    }

    @Test
    public void findAnagrams2() {
        String s = "abab", p = "ab";
        int[] expect = new int[] {0, 1, 2};
        List<Integer> resArray = anagrams.findAnagrams(s, p);
        int[] res = new int[resArray.size()];

        for(int i=0;i<resArray.size();i++) {
            res[i] = resArray.get(i);
        }
        Assert.assertArrayEquals(expect, res);


    }



}
