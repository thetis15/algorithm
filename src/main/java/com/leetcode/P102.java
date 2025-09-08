package com.leetcode;

import com.leetcode.util.TreeNode;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal">
 *     102. Binary Tree Level Order Traversal</a>
 */

public class P102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return Collections.emptyList();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> tmp = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                tmp.add(n.val);
                if(n.left != null) q.offer(n.left);
                if(n.right != null) q.offer(n.right);
            }

            res.add(tmp);
        }

        return res;
    }
}
