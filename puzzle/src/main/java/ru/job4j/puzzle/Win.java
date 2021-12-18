package ru.job4j.puzzle;

import java.util.Arrays;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 1 && (monoHorizontal(board, row)
                        || monoVertical(board, row))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(int[][]board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int cell) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
