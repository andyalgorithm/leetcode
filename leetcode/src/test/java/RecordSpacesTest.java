import org.junit.Test;

public class RecordSpacesTest {
    RecordSpaces solver = new RecordSpaces();

    @Test
    public void test1(){
        String text = "  this   is  a sentence ";
        String res = solver.reorderSpaces(text);
        System.out.println(res);
        // this   is   a   sentence
    }

    @Test
    public void test2(){
        String text = " practice   makes   perfect";
        String res = solver.reorderSpaces(text);
        System.out.println(res);
        // practice   makes   perfect
    }

    @Test
    public void test3(){
        String text = "hello   world";
        String res = solver.reorderSpaces(text);
        System.out.println(res);
        // hello   world
    }

    @Test
    public void test4(){
        String text = "  walks  udp package   into  bar a";
        String res = solver.reorderSpaces(text);
        System.out.println(res);
        // walks  udp  package  into  bar  a
    }

    @Test
    public void test5(){
        String text = "a";
        String res = solver.reorderSpaces(text);
        System.out.println(res);
        // a
    }
}
