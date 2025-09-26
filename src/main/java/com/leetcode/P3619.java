package com.leetcode;


/**
 * <a href="https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k/description/">
 *     3619. Count Islands With Total Value Divisible by K</a>
 */
public class P3619 {
    /**
     * 정수인 섬을 bfs 로 돌면서 물로 변경하고 섬이 끝날때 까지 sum 한 뒤 k 로 나눌수 있을때 count++ 해서 그 값을 리턴함.
     *
     * TC = mn^2
     * SC = 3 = 1
     */
    public int countIslands(int[][] grid, int k) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] > 0){
                    long[] sum = new long[1];
                    bfs(grid, i, j, sum);
                    if(sum[0] > 0 && sum[0] % k == 0) count++;
                }
            }
        }
        return count;
    }

    void bfs(int[][] grid, int x, int y, long[] sum) {
        if(x < 0 || grid.length <= x || y < 0 || grid[x].length <= y || grid[x][y] == 0) return;

        sum[0] += grid[x][y];
        grid[x][y] = 0;
        bfs(grid, x - 1, y, sum); // left
        bfs(grid, x, y + 1, sum); // up
        bfs(grid, x + 1, y, sum); // right
        bfs(grid, x, y - 1, sum); // down
    }
}
