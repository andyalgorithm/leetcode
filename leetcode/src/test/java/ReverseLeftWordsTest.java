import org.junit.Test;

public class ReverseLeftWordsTest {
    ReverseLeftWords solver = new ReverseLeftWords();

    @Test
    public void test1(){
        String s = "abcdefg";
        int n = 2;
        String res = solver.reverseLeftWords(s, n);
        System.out.println(res);
        // cdefgab
    }

    @Test
    public void test2(){
        String s = "lrloseumgh";
        int n = 6;
        String res = solver.reverseLeftWords(s, n);
        System.out.println(res);
        // umghlrlose
    }
}
