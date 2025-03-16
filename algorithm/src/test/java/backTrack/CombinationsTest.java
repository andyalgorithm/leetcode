package backTrack;

import org.junit.Test;

import java.util.ArrayList;

public class CombinationsTest {

    Combinations solver = new Combinations();

    @Test
    public void testOne() {
        int n = 4;
        int k = 2;
        ArrayList<ArrayList<Integer>> res = solver.combinations(n, k);
        for(ArrayList<Integer> t: res) {
            System.out.println(t);
        }
    }
}
