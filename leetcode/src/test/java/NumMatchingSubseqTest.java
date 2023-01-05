import org.junit.Test;

public class NumMatchingSubseqTest {
    NumMatchingSubseq solver = new NumMatchingSubseq();

    @Test
    public void test1(){
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        int res = solver.numMatchingSubseq(s, words);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2(){
        String s = "dsahjpjauf";
        String[] words = {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
        int res = solver.numMatchingSubseq(s, words);
        System.out.println(res);
        // 2
    }
}
