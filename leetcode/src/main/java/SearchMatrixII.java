/**
 * 240. 搜素二维矩阵II
 */

public class SearchMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        // r1、c1为右上角位置
        // r2、c2为左下角位置
        int r1=0, c1=matrix[0].length-1;
        int r2=matrix.length-1, c2=0;
        while (r1<matrix.length && c1>=0){
            if(matrix[r1][c1]==target){
                return true;
            }else if(matrix[r1][c1]<target){
                r1++;
            }else{
                c1--;
            }
        }
        return false;
    }


}
