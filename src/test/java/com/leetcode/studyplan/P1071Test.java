package com.leetcode.studyplan;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P1071Test {
    P1071 p1071 = new P1071();

    @ParameterizedTest
    @MethodSource("parmas")
    void test(String p1, String p2, String expected) {
        assertThat(p1071.gcdOfStrings(p1, p2)).isEqualTo(expected);
    }

    public static Stream<Arguments> parmas() {
        return Stream.of(
                Arguments.of("ABCABC", "ABC", "ABC"),
                Arguments.of("ABABAB", "ABAB", "AB"),
                Arguments.of("LEET", "CODE", ""),
                Arguments.of("AAAAAB", "AAA", "")
        );
    }

}