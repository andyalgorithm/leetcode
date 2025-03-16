package BFS_DFS;

/**
 * 1254 统计封闭岛屿的数量
 */


public class NumberClosedIslands {

    public int numberClosedIslands(int[][] grid) {
        int res=0;

        for(int i=0; i<grid.length; i++) {
            dfs(i, 0, grid);
            dfs(i, grid[0].length-1, grid);
        }

        for(int j=0; j<grid[0].length; j++) {
            dfs(0, j, grid);
            dfs(grid.length-1, j, grid);
        }

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length; j++) {
                if(grid[i][j]==0) {
                    res += 1;
                    dfs(i, j, grid);
                }
            }
        }

        return res;
    }

    void dfs(int i, int j, int[][] grid) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) {
            return;
        }

        // 海水
        if(grid[i][j]==1) {
            return;
        }

        grid[i][j]=1;
        dfs(i-1, j, grid);
        dfs(i+1, j, grid);
        dfs(i, j-1, grid);
        dfs(i, j+1, grid);
    }
}
