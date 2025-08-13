package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P287Test {
    private P287 p;

    @BeforeEach
    void setUp() {
        p = new P287();
    }

    @Test
    void tc1() {
        int actual = p.findDuplicate(new int[]{1, 3, 4, 2, 2});
        assertEquals(2, actual);

    }

    @Test
    void tc2() {
        int actual = p.findDuplicate(new int[]{3, 1, 3, 4, 2});
        assertEquals(3, actual);

    }

    @Test
    void tc3() {
        int actual = p.findDuplicate(new int[]{3, 3, 3, 3, 3});
        assertEquals(3, actual);
    }
}