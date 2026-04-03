package com.leetcode.studyplan;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P1768Test {
  P1768 p = new P1768();

  @ParameterizedTest
  @MethodSource("provide")
  void test(String word1, String word2, String expected) {
    assertThat(p.mergeAlternately(word1, word2)).isEqualTo(expected);

  }

  private static Stream<Arguments> provide() {
    return Stream.of(
        Arguments.of("abc", "pqr", "apbqcr"),
        Arguments.of("ab", "pqrs", "apbqrs"),
        Arguments.of("abcd", "pq", "apbqcd")

    );
  }
}