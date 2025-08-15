package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1254Test {
    private P1254 s;

    @BeforeEach
    void setUp() {
        s = new P1254();
    }

    @Test
    void tc() {
        int[][] array = {
                {1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {0, 1, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 1, 0}};
        int actual = s.closedIsland(array);
        assertEquals(1, actual);

    }

    @Test
    void tc1() {
        int[][] array = {
                {1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0}};
        int actual = s.closedIsland(array);
        assertEquals(2, actual);

    }

    @Test
    void tc2() {
        int[][] array = {{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}};
        int actual = s.closedIsland(array);
        assertEquals(1, actual);

    }

    @Test
    void tc3() {
        int[][] array = {{1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}};

        int actual = s.closedIsland(array);
        assertEquals(2, actual);

    }
}