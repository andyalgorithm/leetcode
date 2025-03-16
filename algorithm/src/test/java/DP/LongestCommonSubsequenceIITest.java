package DP;

import org.junit.Test;

public class LongestCommonSubsequenceIITest {

    LongestCommonSubsequenceII solver = new LongestCommonSubsequenceII();

    @Test
    public void testOne(){
        String text1 = "abcde";
        String text2 = "ace";
        int res = solver.longestCommonSubsequence(text1, text2);
        System.out.println(res);
        // 3
    }

    @Test
    public void testTwo(){
        String text1 = "abc";
        String text2 = "abc";
        int res = solver.longestCommonSubsequence(text1, text2);
        System.out.println(res);
        // 3
    }

    @Test
    public void testThree(){
        String text1 = "abc";
        String text2 = "def";
        int res = solver.longestCommonSubsequence(text1, text2);
        System.out.println(res);
        // 0
    }
}
