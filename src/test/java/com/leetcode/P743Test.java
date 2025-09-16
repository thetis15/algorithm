package com.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P743Test {
    P743 p = new P743();

    @Test
    void tc1() {
        int[][] times = {{2, 1, 1}, {2, 3, 1,}, {3, 4, 1,}};
        Assertions.assertThat(p.networkDelayTime(times, 4, 2)).isEqualTo(2);
    }

    @Test
    void tc2() {
        int[][] times = {{1, 2, 1}};
        Assertions.assertThat(p.networkDelayTime(times, 2, 1)).isEqualTo(1);
    }

    @Test
    void tc3() {
        int[][] times = {{1, 2, 1}};
        Assertions.assertThat(p.networkDelayTime(times, 2, 2)).isEqualTo(-1);
    }

}