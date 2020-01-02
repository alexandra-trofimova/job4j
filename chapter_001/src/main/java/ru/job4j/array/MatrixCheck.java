package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int x) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
            if (board[x][i] != board[x][0]) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean monoVertical(char[][] board, int y) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][y] != board[0][y]) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            boolean check = (board[i][i] == 'X');
            if (check && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
