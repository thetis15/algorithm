package com.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P3619Test {
    P3619 p = new P3619();

    @Test
    void tc1(){
        int[][] grid = {{0,2,1,0,0},{0,5,0,0,5},{0,0,1,0,0},{0,1,4,7,0},{0,2,0,0,8}};
        Assertions.assertThat(p.countIslands(grid, 5)).isEqualTo(2);
    }

    @Test
    void tc2(){
        int[][] grid = {{3,0,3,0}, {0,3,0,3}, {3,0,3,0}};
        Assertions.assertThat(p.countIslands(grid, 3)).isEqualTo(6);
    }

    @Test
    void tc3(){
        int[][] grid = {{0,0,0},{0,0,1},{11,0,6},{0,10,2},{0,0,0},{8,0,0}};
        Assertions.assertThat(p.countIslands(grid, 19)).isEqualTo(1);
    }
}