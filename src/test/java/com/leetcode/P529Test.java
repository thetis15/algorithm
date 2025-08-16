package com.leetcode;

import com.leetcode.util.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P529Test {
    private P529 p;

    @BeforeEach
    void setUp() {
        p = new P529();
    }

    @Test
    void tc1() {
        char[][] actual = p.updateBoard(new char[][]{
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}}, new int[]{3, 0});

        for (char[] chars : actual) {
            System.out.println(Arrays.toString(chars));
        }
        assertArrayEquals(
                new char[][] {
                        {'B','1','E','1','B'},
                        {'B','1','M','1','B'},
                        {'B','1','1','1','B'},
                        {'B','B','B','B','B'}
                },
                actual
        );
    }

    @Test
    void tc2() {

        assertArrayEquals(
                new char[][] {
                        {'B','1','E','1','B'},
                        {'B','1','X','1','B'},
                        {'B','1','1','1','B'},
                        {'B','B','B','B','B'}
                },
                p.updateBoard(new char[][]{
                        {'B','1','E','1','B'},
                        {'B','1','M','1','B'},
                        {'B','1','1','1','B'},
                        {'B','B','B','B','B'}}, new int[]{1,2})
        );
    }

}