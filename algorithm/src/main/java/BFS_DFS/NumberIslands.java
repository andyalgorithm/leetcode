package BFS_DFS;

/**
 * 200 岛屿数量
 */

public class NumberIslands {

    public int numberIslands(char[][] grid) {
        int res = 0;

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]=='1') {
                    dfs(i, j, grid);
                    res += 1;
                }
            }
        }

        return res;
    }

    void dfs(int i, int j, char[][] grid) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) {
            return;
        }

        if(grid[i][j]=='0') {
            return;
        }

        grid[i][j]='0';
        dfs(i-1,j,grid);
        dfs(i+1, j, grid);
        dfs(i, j-1, grid);
        dfs(i, j+1, grid);
    }


}
