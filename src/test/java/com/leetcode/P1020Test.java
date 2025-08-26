package com.leetcode;

import com.leetcode.util.StringUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1020Test {

    private P1020 p;

    @BeforeEach
    void setUp() {
        p = new P1020();
    }

    @Test
    void tc1() {
        Assertions.assertThat(p.numEnclaves(new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}))
                .isEqualTo(3);

    }

    @Test
    void tc2() {
        Assertions.assertThat(p.numEnclaves(new int[][]{{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}}))
                .isEqualTo(0);

    }
}