package com.leetcode;


import java.util.*;

/**
 * <a href="https://leetcode.com/problems/network-delay-time/">
 * network delay time</a>
 */
public class P743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Tuple>> tuples = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            tuples.add(new ArrayList<>());
        }

        for(int[] t : times) {
            int node = t[0];
            int nextNode = t[1];
            int time = t[2];
            tuples.get(node).add(new Tuple(nextNode, time));
        }

        int[] visitedTime = new int[n+1];
        Arrays.fill(visitedTime, Integer.MAX_VALUE);
        visitedTime[k] = 0;

        PriorityQueue<Tuple> q = new PriorityQueue<>(Comparator.comparingInt(Tuple::time));

        q.offer(new Tuple(k, 0));

        while(!q.isEmpty()) {
            Tuple t = q.poll();
            int  currentTime = t.time();

            List<Tuple> nextNodes = tuples.get(t.node());
            for(Tuple nt : nextNodes) {
                int nextNode = nt.node();
                int nextTime = nt.time();

                if(currentTime + nextTime < visitedTime[nextNode]) {
                    visitedTime[nextNode] = currentTime + nextTime;
                    q.offer(nt);
                }
            }
        }

        int result = 0;

        for (int i = 1; i <=n; i++) {
            if(visitedTime[i] == Integer.MAX_VALUE) return -1;
            result = Math.max(result, visitedTime[i]);
        }

        return result;


    }
}

record Tuple(int node, int time) { }