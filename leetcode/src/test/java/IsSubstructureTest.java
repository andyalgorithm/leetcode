import org.junit.Test;

public class IsSubstructureTest {
    IsSubstructure solver = new IsSubstructure();

    @Test
    public void test1(){
        int[] numsA = {4,2,3,4,5,6,7,8,9};
        int[] numsB = {4,8,9};
        TreeNode A = TreeNode.numsToTree(numsA);
        TreeNode B = TreeNode.numsToTree(numsB);
        boolean res = solver.isSubStructure(A, B);
        System.out.println(res);
        // true
    }

    @Test
    public void test2(){
        int[] numsA = {1,0,1,-4,-3};
        int[] numsB = {1,-4};
        TreeNode A = TreeNode.numsToTree(numsA);
        TreeNode B = TreeNode.numsToTree(numsB);
        boolean res = solver.isSubStructure(A, B);
        System.out.println(res);
        // false
    }

    @Test
    public void test3(){
        int[] numsA = {10,12,6,8,3,11};
        int[] numsB = {10,12,6,8};
        TreeNode A = TreeNode.numsToTree(numsA);
        TreeNode B = TreeNode.numsToTree(numsB);
        boolean res = solver.isSubStructure(A, B);
        System.out.println(res);
        // true
    }
}
