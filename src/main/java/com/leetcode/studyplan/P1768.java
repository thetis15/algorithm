package com.leetcode.studyplan;

/**
 * <a href="https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75">
 *   1768. Merge Strings Alternately</a>
 */

/**
 * <span>Description</span>
 * <pre>
 *
 *   You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 * </pre>
 */
public class P1768 {
  public String mergeAlternately(String word1, String word2) {
    StringBuilder sb = new StringBuilder();
    int l = Math.max(word1.length(), word2.length());

    for(int i = 0; i < l; i++) {
      if(i < word1.length()) sb.append(word1.charAt(i));
      if(i < word2.length()) sb.append(word2.charAt(i));
    }

    return sb.toString();
  }
}
