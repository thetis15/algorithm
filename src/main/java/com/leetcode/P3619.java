package com.leetcode;


/**
 * <a href="https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k/description/">
 *     3619. Count Islands With Total Value Divisible by K</a>
 */
public class P3619 {
    /**
     * 정수인 섬을 bfs 로 돌면서 물로 변경하고 섬이 끝날때 까지 sum 한 뒤 k 로 나눌수 있을때 count++ 해서 그 값을 리턴함.
     *
     * TC = mn
     * SC = mn
     */
    public int countIslands(int[][] grid, int k) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] > 0){
                    int sum = dfs(grid, i, j);
                    if(sum > 0 && sum % k == 0) count++;
                }
            }
        }
        return count;
    }

    int dfs(int[][] grid, int x, int y) {
        if(x < 0 || grid.length <= x || y < 0 || grid[x].length <= y || grid[x][y] == 0) return 0;

        int sum = grid[x][y];
        grid[x][y] = 0;
        sum += dfs(grid, x - 1, y); // left
        sum += dfs(grid, x, y + 1); // up
        sum += dfs(grid, x + 1, y); // right
        sum += dfs(grid, x, y - 1); // down

        return sum;
    }
}
