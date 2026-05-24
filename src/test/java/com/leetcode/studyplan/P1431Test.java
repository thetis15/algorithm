package com.leetcode.studyplan;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P1431Test {
    P1431 p = new P1431();

    @ParameterizedTest
    @MethodSource("parmas")
    void test(int[] candies, int extraCandies, List<Boolean> expected) {
        Assertions.assertThat(p.kidsWithCandies(candies, extraCandies)).containsExactlyElementsOf(expected);
    }


    public static Stream<Arguments> parmas() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 5, 1, 3}, 3, List.of(true, true, true, false, true)),
                Arguments.of(new int[]{4, 2, 1, 1, 2}, 1, List.of(true, false, false, false, false)),
                Arguments.of(new int[]{12, 1, 12}, 10, List.of(true, false, true))
        );
    }

}