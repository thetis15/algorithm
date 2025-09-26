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
                    int sum = bfs(grid, i, j, 0);
                    if(sum > 0 && sum % k == 0) count++;
                }
            }
        }
        return count;
    }

    int bfs(int[][] grid, int x, int y, int sum) {
        if(x < 0 || grid.length <= x || y < 0 || grid[x].length <= y || grid[x][y] == 0) return sum;

        sum += grid[x][y];
        grid[x][y] = 0;
        sum += bfs(grid, x - 1, y, sum); // left
        sum += bfs(grid, x, y + 1, sum); // up
        sum += bfs(grid, x + 1, y, sum); // right
        sum += bfs(grid, x, y - 1, sum); // down

        return sum;
    }
}
