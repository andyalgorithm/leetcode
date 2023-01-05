import org.junit.Test;

public class SimplifyPathTest {
    SimplifyPath solver = new SimplifyPath();

    @Test
    public void test1(){
        String path = "/home/";
        String res = solver.simplifyPath(path);
        System.out.println(res);
    }

    @Test
    public void test2(){
        String path = "/../";
        String res = solver.simplifyPath(path);
        System.out.println(res);
    }

    @Test
    public void test3(){
        String path = "/home//foo/";
        String res = solver.simplifyPath(path);
        System.out.println(res);
    }

    @Test
    public void test4(){
        String path = "/a/./b/../../c/";
        String res = solver.simplifyPath(path);
        System.out.println(res);
    }
}
