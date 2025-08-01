package com.leetcode;

import com.leetcode.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/remove-nodes-from-linked-list/">
 * 2487. Remove Nodes From Linked List</a>
 */
public class P2487 {
    public ListNode removeNodes(ListNode head) {
        ListNode tmp = null, pre = null, curr = head;

        while (curr != null) {
            tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }

        curr = pre.next;
        pre.next = null;

        while (curr != null) {
            tmp = curr.next;
            if (curr.val >= pre.val) {
                curr.next = pre;
                pre = curr;
            }
            curr = tmp;
        }

        return pre;
    }


}