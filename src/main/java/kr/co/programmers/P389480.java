package kr.co.programmers;

import java.util.*;

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/389480">완전범죄</a>
 */
public class P389480 {
    public int solution(int[][] info, int n, int m) {
        Map<String, Integer> map = new HashMap<>();

        int answer = dfs(info, n, m, 0, 0, 0, map);

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private int dfs(int[][] info, int n, int m, int depth, int aTotal, int bTotal, Map<String, Integer> map) {
        if (depth == info.length) {
            return aTotal;
        }

        String key = String.format("%d-%d-%d", depth, aTotal, bTotal);

        if (map.containsKey(key)) {
            return map.get(key);
        }

        int currentA = info[depth][0];
        int currentB = info[depth][1];

        int min = Integer.MAX_VALUE;

        if(aTotal + currentA < n) {
            min = Math.min(min, dfs(info, n, m, depth + 1, aTotal + currentA, bTotal, map));
        }

        if(bTotal + currentB < m) {
            min = Math.min(min, dfs(info, n, m, depth + 1, aTotal, bTotal + currentB, map));
        }

        map.put(key, min);

        return min;
    }



















    private int answer(int[][] info, int n, int m) {
        Map<String, Integer> memo = new HashMap<>();
        int result = answerDfs(info, n, m, memo, 0, 0, 0, 0);
        return (result != Integer.MAX_VALUE) ? result : -1;
    }

    private int answerDfs(int[][] info, int n, int m, Map<String, Integer> memo, int i, int a, int b, int depth) {
        String indent = "  ".repeat(depth); // 깊이에 따른 들여쓰기

        if (i == info.length) {
            System.out.println(indent + "모든 도둑 사용 완료: a=" + a + ", b=" + b);
            return a;
        }

        String key = i + "-" + a + "-" + b;
        if (memo.containsKey(key)) {
            System.out.println(indent + "Memo hit: " + key + " -> " + memo.get(key));
            return memo.get(key);
        }

        int x = info[i][0];
        int y = info[i][1];
//        System.out.println(indent + "dfs(i=" + i + ", a=" + a + ", b=" + b + ") -> 도둑[" + i + "] = (" + x + "," + y + ")");
        System.out.println(indent + "[DFS 호출] i: " + i
                + " | A도둑 총합: " + a
                + " | B도둑 총합: " + b
                + " | 현재 도둑: info[" + i + "] = (A:" + x + ", B:" + y + ")");

        int min = Integer.MAX_VALUE;

        if (a + x < n) {
            System.out.println(indent + " A도둑 사용 → a=" + (a + x));
            min = Math.min(min, answerDfs(info, n, m, memo, i + 1, a + x, b, depth + 1));
        } else {
            System.out.println(indent + " A도둑 불가 (a + x >= n)");
        }

        if (b + y < m) {
            System.out.println(indent + " B도둑 사용 → b=" + (b + y));
            min = Math.min(min, answerDfs(info, n, m, memo, i + 1, a, b + y, depth + 1));
        } else {
            System.out.println(indent + " B도둑 불가 (b + y >= m)");
        }

        memo.put(key, min);
        System.out.println(indent + "→ memo 저장: " + key + " -> " + min);

        return min;
    }
}
