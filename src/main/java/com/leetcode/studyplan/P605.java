package com.leetcode.studyplan;

/**
 * <a href="https://leetcode.com/problems/can-place-flowers">
 * Can Place Flowers</a>
 *
 * <span>Description</span>
 * <pre>
 *     You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * Example 2:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 *
 * </pre>
 */

/**
 * TC = n = O(n)
 * SC = current = O(1)
 */
public class P605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        int current = 0;
        while(current < flowerbed.length) {

            if (flowerbed[current] == 0) {
                if((current - 1 < 0 || flowerbed[current-1] == 0) &&
                        (current + 1 == flowerbed.length || flowerbed[current + 1] == 0) ) {
                    flowerbed[current] = 1;
                    n--;

                    // String debug = String.format("c:%d, %b, %b, ,%d %b, %b\n",
                    //         (current)
                    //     ,(current - 1 > 0)
                    // ,(flowerbed[current-1] == 0)
                    // ,(flowerbed[current-1])
                    // ,(current - 1 > 0 && flowerbed[current-1] == 0)
                    // , (current + 1 < flowerbed.length && flowerbed[current + 1] == 0));


                    // System.out.printf(debug);
                }

                if(n == 0) return true;
            }
            current++;

        }

        return false;
    }
}
