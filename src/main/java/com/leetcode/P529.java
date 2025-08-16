package com.leetcode;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * <a href="https://leetcode.com/problems/minesweeper">529. Minesweeper</a>
 */
public class P529 {
    private final int[] direction = {-1, 0, 1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0], y = click[1];

        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return board;
        }

        dfs(board, x, y);

        return board;
    }

    AtomicInteger ai = new AtomicInteger();
    private void dfs(char[][] board, int x, int y) {
        if(x < 0 || x > board.length - 1 || y < 0 || y > board[x].length - 1 || board[x][y] != 'E')
            return;

        int mines = countMine(board, x, y);

        if (mines == 0) {
            board[x][y] = 'B';
            for (int cx : direction) {
                for (int cy : direction) {
                    if (cx == 0 && cy == 0) continue;
                    dfs(board, x + cx, y + cy);
                }
            }
        } else {
            board[x][y] = (char) ('0' + mines);
        }
    }

    private int countMine(char[][] board, int x, int y) {
        int count = 0;
        for (int cx : direction) {
            for (int cy : direction) {
                if (cx == 0 && cy == 0) continue;
                int sx = cx + x; // scan x
                int sy = cy + y; // scan y

                if (sx >= 0 && sx < board.length && sy >= 0 && sy < board[0].length && board[sx][sy] == 'M') count++;
            }
        }

        return count;
    }
}
