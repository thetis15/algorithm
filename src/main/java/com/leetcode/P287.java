package com.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/find-the-duplicate-number//">
 * 287. Find the Duplicate Number</a>
 */
public class P287 {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0], finder = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);


        while (slow != finder) {
            slow = nums[slow];
            finder = nums[finder];
        }

        return finder;
    }
}