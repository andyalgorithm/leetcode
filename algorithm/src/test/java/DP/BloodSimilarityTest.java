package DP;

import org.junit.Test;

public class BloodSimilarityTest {
    BloodSimilarity solver = new BloodSimilarity();

    @Test
    public void testOne() {
        String str1 = "ACT";
        String str2 = "AGCT";
        int res = solver.bloodSimilarity(str1, str2);
        System.out.println(res);
    }
}
