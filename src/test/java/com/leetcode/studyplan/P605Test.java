package com.leetcode.studyplan;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class P605Test {
    P605 p = new P605();

    @ParameterizedTest
    @MethodSource("parmas")
    void test(int[] flowerbed, int n, boolean expected) {
        assertThat(p.canPlaceFlowers(flowerbed, n)).isEqualTo(expected);
    }

    public static Stream<Arguments> parmas() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{0, 0, 1, 0, 1}, 1, true)
        );
    }
}