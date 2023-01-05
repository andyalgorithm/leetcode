/**
 * 54. 顺时针打印矩阵
 */

public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0 || matrix[0].length==0){
            return new int[0];
        }

        int[] res = new int[matrix.length*matrix[0].length];
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
        int pos=0;
        while (true){
            // left to right
            for(int i=left; i<=right; i++){
                res[pos++] = matrix[top][i];
            }
            if(top>=bottom){
                break;
            }else{
                top++;
            }

            // top to bottom
            for(int j=top; j<=bottom; j++){
                res[pos++] = matrix[j][right];
            }
            if(left>=right){
                break;
            }else{
                right--;
            }

            // right to left
            for(int i=right;i>=left;i--){
                res[pos++] = matrix[bottom][i];
            }
            if(top>=bottom){
                break;
            }else{
                bottom--;
            }

            // bottom to top
            for(int j=bottom; j>=top; j--){
                res[pos++] = matrix[j][left];
            }
            if(left>=right){
                break;
            }else{
                left++;
            }
        }

        return res;
    }
}
