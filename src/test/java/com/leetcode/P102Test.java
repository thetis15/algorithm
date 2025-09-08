package com.leetcode;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class P102Test {
    @Test
    void tc1() {
        P102 p = new P102();

        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertThat(p.levelOrder(root))
                .isEqualTo(Arrays.asList(
                        Arrays.asList(3),
                        Arrays.asList(9, 20),
                        Arrays.asList(15, 7)
                ));

    }

    @Test
    void tc2() {
        P102 p = new P102();

        TreeNode root = new TreeNode(1);
        assertThat(p.levelOrder(root))
                .isEqualTo(Arrays.asList(
                        Arrays.asList(1)
                ));

    }

    @Test
    void tc3() {
        P102 p = new P102();

        assertThat(p.levelOrder(null))
                .isEqualTo(Arrays.asList(
                ));

    }
}