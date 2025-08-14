package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P389480Test {
    private P389480 p = new P389480();

    @Test
    void tc1() {
        assertEquals(2, p.solution(new int[][]{{1, 2}, {2, 3}, {2, 1}}, 4, 4));
    }

    @Test
    void tc2() {
        assertEquals(0, p.solution(new int[][]{{1, 2}, {2, 3}, {2, 1}}, 1, 7));
    }

    @Test
    void tc3() {
        assertEquals(6, p.solution(new int[][]{{3, 3}, {3, 3}}, 7, 1));
    }

    @Test
    void tc4() {
        assertEquals(-1, p.solution(new int[][]{{3, 3}, {3, 3}}, 6, 1));
    }


    @Test
    void tc5() {
        assertEquals(1, p.solution(new int[][]{{1, 1}, {1, 1}, {1, 1}, {1, 1}}, 3, 4));
    }


    @Test
    void tc6() {
        assertEquals(4, p.solution(new int[][]{{1, 3}, {1, 3}, {1, 1}, {1, 1}, {1, 1}, {2, 3}, {2, 3}}, 6, 7));
    }

}