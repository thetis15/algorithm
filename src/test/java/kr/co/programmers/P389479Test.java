package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P389479Test {
    private P389479 p = new P389479();

    @Test
    void tc1() {
        assertEquals(7,
                p.solution(new int[]{0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5},
                        3, 5));
    }
    @Test
    void tc2() {
        assertEquals(11,
                p.solution(new int[]{0, 0, 0, 10, 0, 12, 0, 15, 0, 1, 0, 1, 0, 0, 0, 5, 0, 0, 11, 0, 8, 0, 0, 0},
                        5, 1));
    }

    @Test
    void tc3() {
        assertEquals(12,
                p.solution(new int[]{0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
                        1, 1));
    }
}