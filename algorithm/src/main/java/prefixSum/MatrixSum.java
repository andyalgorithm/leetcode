package prefixSum;

/**
 * 1314. 矩阵区域和
 */

public class MatrixSum {


    public int[][] matrixSum(int[][] matrix, int k) {
        // 计算矩阵和
        int[][] sum = new int[matrix.length+1][matrix[0].length+1];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                sum[i+1][j+1] = matrix[i][j]+sum[i+1][j]+sum[i][j+1]-sum[i][j];
            }
        }

        int[][] res = new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                int row1 = Math.max(0, i-k);
                int col1 = Math.max(0, j-k);
                int row2 = Math.min(matrix.length-1, i+k);
                int col2 = Math.min(matrix[0].length-1, j+k);
                res[i][j] = sum[row2+1][col2+1] + sum[row1][col1]
                            - sum[row1][col2+1] - sum[row2+1][col1];
            }
        }
        return res;
    }
}
