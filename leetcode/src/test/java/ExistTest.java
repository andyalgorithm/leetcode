import org.junit.Test;

public class ExistTest {
    Exist solver = new Exist();

    @Test
    public void test1(){
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}    
        };
        String word = "ABCCED";
        boolean res = solver.exist(board, word);
        System.out.println(res);
        // true
    }

    @Test
    public void test2(){
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "SEE";
        boolean res = solver.exist(board, word);
        System.out.println(res);
        // true
    }

    @Test
    public void test3(){
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCB";
        boolean res = solver.exist(board, word);
        System.out.println(res);
        // false
    }

    @Test
    public void test4(){
        char[][] board = {
                {'a'}};
        String word = "a";
        boolean res = solver.exist(board, word);
        System.out.println(res);
        // true
    }

    @Test
    public void test5(){
        char[][] board = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        };
        String word = "AAB";
        boolean res = solver.exist(board, word);
        System.out.println(res);
        // true
    }
}
