package com.leetcode;

public class P1254 {
    public int closedIsland(int[][] grid) {
        int row = grid.length;
        int column = grid[row - 1].length;
        int count = 0;



        // 가장자리에 있는 섬을 모두 바다로 변경
        for (int i = 0; i < row; i++) {
            if (grid[i][0] == 0) {
                dfs(grid, i, 0);
            }
            if (grid[i][column - 1] == 0) {
                dfs(grid, i, column - 1);
            }
        }
        for (int j = 0; j < column; j++) {
            if (grid[0][j] == 0) {
                dfs(grid, 0, j);
            }
            if (grid[row - 1][j] == 0) {
                dfs(grid, row - 1, j);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }


    private void dfs(int[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != 0) return;

        grid[i][j] = 1;
        dfs(grid, i + 1, j); // up
        dfs(grid, i - 1, j); // down
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
}
