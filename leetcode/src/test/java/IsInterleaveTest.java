import org.junit.Test;

public class IsInterleaveTest {
    IsInterleave solver = new IsInterleave();

    @Test
    public void test1(){
        String s1 = "aabcc";
        String s2  ="dbbca";
        String s3 = "aadbbcbcac";
        boolean res = solver.isInterleave(s1, s2, s3);
        System.out.println(res);
        // true
    }

    @Test
    public void test2(){
        String s1 = "aabcc";
        String s2  ="dbbca";
        String s3 = "aadbbbaccc";
        boolean res = solver.isInterleave(s1, s2, s3);
        System.out.println(res);
        // false
    }

    @Test
    public void test3(){
        String s1 = "";
        String s2  ="";
        String s3 = "";
        boolean res = solver.isInterleave(s1, s2, s3);
        System.out.println(res);
        // true
    }

    @Test
    public void test4(){
        String s1 = "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa";
        String s2  ="babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab";
        String s3 = "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab";
        boolean res = solver.isInterleave(s1, s2, s3);
        System.out.println(res);
        // false
    }
}
