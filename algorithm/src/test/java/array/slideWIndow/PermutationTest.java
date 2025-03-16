package array.slideWIndow;

import org.junit.Assert;
import org.junit.Test;
import array.slideWindow.Permutation;

public class PermutationTest {

    private Permutation mutation = new Permutation();

    @Test
    public void permutationTest1() {
        String s1 = "ab", s2 = "eidbaooo";
        boolean res = mutation.permutation(s1,s2);
        Assert.assertTrue(res);
    }
}
