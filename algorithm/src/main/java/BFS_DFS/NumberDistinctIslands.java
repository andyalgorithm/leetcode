package BFS_DFS;

import java.util.ArrayList;

/**
 * 694 不同的岛屿数量
 */

public class NumberDistinctIslands {

    public int numberDistinctIslands(char[][] grid) {
        int res = 0;
        ArrayList<String> shape = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]=='1') {
                    dfs(i, j, grid, temp, "");
                    if(!contain(temp.toString(), shape)) {
                        res += 1;
                        shape.add(temp.toString());
                    }
                    temp.delete(0, temp.length());
                }
            }
        }

        return res;
    }

    void dfs(int i, int j, char[][] grid, StringBuilder s, String dir) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) {
            return;
        }
        if(grid[i][j]=='0') {
            return;
        }

        // 记录外形
        s.append(dir);

        grid[i][j]='0';
        dfs(i-1, j, grid, s, "1");
        dfs(i+1, j, grid, s, "2");
        dfs(i, j-1, grid, s, "3");
        dfs(i, j+1, grid, s, "4");

    }

    boolean contain(String s, ArrayList<String> shape) {
        for(String t: shape) {
            if(t.equals(s)) {
                return true;
            }
        }
        return false;
    }

}
