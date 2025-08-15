package kr.co.programmers;

import java.util.*;

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/389479">서버 증설 횟수</a>
 */
public class P389479 {
    public int solution(int[] players, int m, int k) {
        int count = 0;

        Queue<Integer> active = new LinkedList<>();

        for (int i = 0; i < players.length; i++) {
            while (!active.isEmpty() && active.peek() <= i) {
                active.poll();
            }

            int newPlayer = (players[i] / m) - active.size();

            if (newPlayer > 0) {
                count += newPlayer;
                for (int j = 0; j < newPlayer; j++) {
                    active.offer(i + k);
                }
            }
        }



        return count;
    }
}