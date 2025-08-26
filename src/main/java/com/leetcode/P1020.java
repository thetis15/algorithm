package com.leetcode;


import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/number-of-enclaves/">
 * 1020. Number of Enclaves</a>
 */
public class P1020 {

    /*
     * 그리드 외각에서 접근할 수 없는 육지의 갯수를 리턴함.
     *
     * 외각에서 접근할 수 있는 모든 육지를 섬'0' 으로 변경후 육지의 갯수를 세어서 리턴함
     *
     * dfs 로 외각 육지를 전부 삭제함.
     *
     */
    public int numEnclaves(int[][] grid) {
        var count = 0;
        var xl = grid.length;
        var yl = grid[0].length;

        for (int y = 0; y < yl; y++) {
            dfs(0, y, grid, new boolean[xl][yl]);
            dfs(xl - 1, y, grid, new boolean[xl][yl]);
        }

        for (int x = 0; x < xl; x++) {
            dfs(x, 0, grid, new boolean[xl][yl]);
            dfs(x, yl - 1, grid, new boolean[xl][yl]);
        }

        for (int[] ints : grid) {
            for (int cell : ints) {
                if (cell == 1) count++;
            }
        }

        return count;

    }

    private void dfs(int x, int y, int[][] grid, boolean[][] visited) {
        if(x < 0 || x >= visited.length || y < 0 || y >= visited[0].length || visited[x][y]) return;

        visited[x][y] = true;
        if (grid[x][y] == 1) {
            grid[x][y] = 0;
            dfs(x + 1, y, grid, visited); // up
            dfs(x, y + 1, grid, visited); // right
            dfs(x - 1, y, grid, visited); // down
            dfs(x, y - 1, grid, visited); // left
        }

    }

    private static void printGrid(int[][] grid) {
        System.out.println("############ print grid");
        for (int[] ints : grid) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
    }

}
