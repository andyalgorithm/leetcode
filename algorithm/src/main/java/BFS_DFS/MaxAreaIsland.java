package BFS_DFS;

/**
 * 695 岛屿最大面积
 */

public class MaxAreaIsland {

    int area = 0;

    public int maxAreaIsland(int[][] grid) {
        int res=0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]==1) {
                    dfs(i, j, grid);
                    res = Math.max(res, area);
                    area = 0;
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
        area += 1;
        dfs(i-1, j, grid);
        dfs(i+1, j, grid);
        dfs(i, j-1, grid);
        dfs(i, j+1, grid);
    }


}
