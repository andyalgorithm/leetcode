import org.junit.Test;

public class IntToRomanTest {
    IntToRoman solver = new IntToRoman();

    @Test
    public void test1(){
        int num = 3;
        String res = solver.intToRoman(num);
        System.out.println(res);
        // III
    }

    @Test
    public void test2(){
        int num = 4;
        String res = solver.intToRoman(num);
        System.out.println(res);
        // IV
    }

    @Test
    public void test3(){
        int num = 9;
        String res = solver.intToRoman(num);
        System.out.println(res);
        // IX
    }

    @Test
    public void test4(){
        int num = 58;
        String res = solver.intToRoman(num);
        System.out.println(res);
        // LVIII
    }

    @Test
    public void test5(){
        int num = 1994;
        String res = solver.intToRoman(num);
        System.out.println(res);
        // MCMXCIV
    }
}
