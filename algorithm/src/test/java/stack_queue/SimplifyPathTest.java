package stack_queue;

import org.junit.Assert;
import org.junit.Test;

public class SimplifyPathTest {

    private SimplifyPath simple = new SimplifyPath();

    @Test
    public void test1() {
        String path = new String("/home/");
        String res = simple.simplifyPath(path);
        String expect = new String("/home");
        Assert.assertEquals(expect, res);
    }

    @Test
    public void test2() {
        String path = new String("/.../");
        String res = simple.simplifyPath(path);
        String expect = new String("/...");
        Assert.assertEquals(expect, res);
    }

    @Test
    public void test3() {
        String path = new String("/../");
        String res = simple.simplifyPath(path);
        String expect = new String("/");
        Assert.assertEquals(expect, res);
    }

    @Test
    public void test4() {
        String path = new String("/home//foo/");
        String res = simple.simplifyPath(path);
        String expect = new String("/home/foo");
        Assert.assertEquals(expect, res);
    }
}
