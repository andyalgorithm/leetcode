package BFS_DFS;

/**
 *  1905 统计子岛屿
 */

public class CountSubIslands {

    public int countSubIsland(int[][] grid1, int[][] grid2) {
        int res=0;

        // 预处理，淹没掉非子岛
        for(int i=0; i< grid1.length; i++) {
            for(int j=0; j<grid1[0].length; j++) {
                if(grid1[i][j]==0 && grid2[i][j]==1) {
                    // 淹没掉grid2岛
                    dfs(i, j, grid2);
                }
            }
        }

        // 计算子岛
        for(int i=0; i<grid2.length;i++) {
            for(int j=0; j<grid2[0].length; j++) {
                if(grid2[i][j]==1) {
                    dfs(i, j, grid2);
                    res += 1;
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

        grid[i][j]=0;
        dfs(i-1, j, grid);
        dfs(i+1, j, grid);
        dfs(i,j-1, grid);
        dfs(i, j+1, grid);

    }
}
