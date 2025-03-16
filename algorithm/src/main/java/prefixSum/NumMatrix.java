package prefixSum;

/**
 * 304. ⼆维区域和检索 - 矩阵不可变
 */

public class NumMatrix {

    private int[][] matrix;

    public NumMatrix(int[][] matrix) {

        this.matrix = new int[matrix.length+1][matrix[0].length+1];
        // 初始值为0
//        System.out.println(matrix[0][0]);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                this.matrix[i+1][j+1] = matrix[i][j] + this.matrix[i+1][j] + this.matrix[i][j+1]
                        - this.matrix[i][j];
//                System.out.println(""+(i)+", "+(j)+": "+this.matrix[i+1][j+1]);
            }

        }
    }

    int sumRegion(int row1, int col1, int row2, int col2) {
        // 越界处理 略
        // ...

        return matrix[row2+1][col2+1]+matrix[row1][col1]-matrix[row1][col2+1]-matrix[row2+1][col1];
    }
}
