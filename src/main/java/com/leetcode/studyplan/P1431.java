package com.leetcode.studyplan;

/**
 * <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description"
 * 1431. Kids With the Greatest Number of Candies </a>
 */

import java.util.ArrayList;
import java.util.List;

/**
 * <span>Description</span>
 * <pre>
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 *
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 *
 * Note that multiple kids can have the greatest number of candies.
 * </pre>
 */

/**
 * TC = 2n = O(n)
 * SC = list and max = 2 = O(1)
 */
public class P1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>(candies.length);
        for(int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        for(int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;

    }
}
