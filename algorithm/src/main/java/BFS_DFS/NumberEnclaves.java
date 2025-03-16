package BFS_DFS;

/**
 * 1020 飞地的数量
 */

public class NumberEnclaves {

    int res = 0;

    public int numberEnclaves(int[][] grid) {

        int m=grid.length, n=grid[0].length;


        for(int i=0; i<m;i++) {
            for(int j=0; j<n;j++) {
                if(grid[i][j]==1) {
                    if (i == 0 || i == grid.length - 2 && j == 0 || j == grid[0].length - 2) {
                        // 排除该位置为岛屿
                        dfs(i, j, grid);
                        res -= 1;
                    } else{
                        // 发现岛屿
                        dfs(i, j, grid);
                    }
                }
            }
        }


        return res;
    }

    void dfs(int i, int j, int[][] grid) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) {
            return;
        }

        if(grid[i][j]==0) {
            return;
        }


        grid[i][j] = 0;
        res += 1;
        dfs(i, j-1, grid); // 上
        dfs(i, j+1, grid); // 下
        dfs(i-1, j, grid); // 左
        dfs(i+1, j, grid); // 右


    }
}
