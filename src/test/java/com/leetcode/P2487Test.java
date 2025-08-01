package com.leetcode;

import com.leetcode.util.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.leetcode.util.ListNode.arrayToNode;
import static org.junit.jupiter.api.Assertions.*;

class P2487Test {
    private P2487 p;

    @BeforeEach
    void setUp() {
        p = new P2487();
    }

    @Test
    void tc1() {
        ListNode listNode = arrayToNode(List.of(5, 2, 13, 3, 8));
        System.out.println(p.removeNodes(listNode));
        ListNode expected = p.removeNodes(
                arrayToNode(List.of(13, 8))
        );
        ListNode actual = p.removeNodes(
                arrayToNode(List.of(5, 2, 13, 3, 8))
        );
        assertEquals(
                expected,
                actual
        );
    }

    @Test
    void tc2() {
        assertEquals(
                p.removeNodes(
                        arrayToNode(List.of(1,1,1,1))
                ),
                p.removeNodes(
                        arrayToNode(List.of(1,1,1,1))
                )
        );
    }

    @Test
    void tc3() {
        assertEquals(
                p.removeNodes(
                        arrayToNode(List.of(10))
                ),
                p.removeNodes(
                        arrayToNode(List.of(10))
                )
        );
    }

    @Test
    void tc4() {
        assertEquals(
                p.removeNodes(
                        arrayToNode(List.of(1,2,3,4,5))
                ),
                p.removeNodes(
                        arrayToNode(List.of(5))
                )
        );
    }

    @Test
    void tc5() {
        assertEquals(
                p.removeNodes(
                        arrayToNode(List.of(5,4,3,2,1))
                ),
                p.removeNodes(
                        arrayToNode(List.of(5,4,3,2,1))
                )
        );
    }

}