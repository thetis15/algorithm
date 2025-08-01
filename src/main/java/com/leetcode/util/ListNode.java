package com.leetcode.util;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode arrayToNode(List<Integer> list) {
        ListNode res = new ListNode();
        ListNode cur = res;
        for (Integer i : list) {
            res.next = new ListNode(i);
            res = res.next;
        }
        return cur.next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode curr2)) return false;
        ListNode curr1 = this;
        while (curr1 != null && curr2 != null) {
            if (curr1.val != curr2.val) return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr1 == null && curr2 == null;
    }

    @Override
    public int hashCode() {
        int result = 1;
        ListNode current = this;
        while (current != null) {
            result = 31 * result + current.val;
            current = current.next;
        }
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "val=" + val +
                (next != null ?  ", next=" + next : "") +
                '}';
    }
}
