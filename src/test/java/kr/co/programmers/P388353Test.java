package kr.co.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P388353Test {
    P388353 p;

    @BeforeEach
    void setUp() {
        p = new P388353();
    }

    @Test
    void tc1() {
        assertThat(p.solution(new String[]{"AZWQY", "CAABX", "BBDDA", "ACACA"}, new String[]{"A", "BB", "A"})).isEqualTo(11);
    }

    @Test
    void tc2() {
        assertThat(p.solution(new String[]{"HAH", "HBH", "HHH", "HAH", "HBH"}, new String[]{"C", "B", "B", "B", "B", "H"})).isEqualTo(4);
    }
}