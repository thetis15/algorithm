package com.leetcode;

import java.util.*;


/**
 * <a href="https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/">
1190. Reverse Substrings Between Each Pair of Parentheses</a>
 */

public class P1190 {
    public String reverseParentheses(String s) {
        // 알고리즘의 설명대로 제일 안쪽부터 뒤집어 가면서 밖으로 나옴.
        // 밖에서부터 짝수번째는 바꾸지 않아도 됨
        // 괄호는 전체를 위치를 알 수 없으니 다 찾아야 함. 
        
        
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int r = 0;
        int ll = 0;
        int lr = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                cnt++;
                l = i;
            } else if(s.charAt(i) == ')') {
                r = i;
                break;
            }
        }
        if (r == 0) return s;
        ll = l;
        lr = r;

        cnt = 0;
        while(l >= 0 && r <= s.length()) {
            cnt++;
            // 0123456789
            // (ed(et(oc))el)
            // l = 6, r=9, cnt=3;
            if(ll == l) sb.append(s.substring(l+1, r));
            else {
                sb.insert(0, s.substring(l+1, ll));
                //0123456789
                //(u(love)i)
                // System.out.println(">>>>> " +s.substring(lr+1, r));
                sb.append(s.substring(lr+1, r));

            }
            ll = l;
            lr = r;
            sb.reverse();
            while (true) {
                l--;
                if(l < 0 || s.charAt(l) == '(') break;
            }
            while (true) {
                r++;
                if(r >= s.length() || s.charAt(r) == ')') break;
            }
        }
        
        System.out.printf("l=%d, r=%d, cnt=%d, ll=%d, lr=%d \n",l, r, cnt, ll, lr);
        if(ll > 0 ) {
            sb.insert(0, s.substring(0,ll));
        }
        if(lr <= s.length() - 1) {
            // System.out.println(lr);
            // System.out.println(s.substring(lr + 1, s.length()) );
            sb.append(s.substring(lr + 1, s.length()));
        }
        // System.out.println(sb);
        // System.out.println(cnt);
        // System.out.println(sb.toString());
        
        
        return sb.toString();
    }
}
