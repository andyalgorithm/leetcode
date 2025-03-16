package backTrack;

import org.junit.Test;

public class PartitionKEqualSumSubsetsTest {

    PartitionKEqualSumSubsets solver = new PartitionKEqualSumSubsets();

    @Test
    public void testOne() {
        int[] nums = new int[] {4,3,2,3,5,2,1};
        int k = 4;
        boolean res = solver.partitionKEqualSumSubsets(nums, k);
        System.out.println(res);
        // true
    }

    @Test
    public void testTwo() {
        int[] nums = new int[] {1,2,3,4};
        int k = 3;
        boolean res = solver.partitionKEqualSumSubsets(nums, k);
        System.out.println(res);
        // false
    }
}
