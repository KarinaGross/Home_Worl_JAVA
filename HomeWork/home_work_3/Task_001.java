package home_work_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке
 * была строго один раз.
 * N подается на входе. В каждую ячейку пишем номер шага, которым туда зашли.
 */
public class Task_001 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<String>> result = sol.solvedHorse(4);
        System.out.println(result);
    }

}

class Solution {
    int[][] board;
    List<List<String>> ans = new ArrayList<>();
    int[][] moves = { { 1, 2 }, { -1, 2 }, { 1, -2 }, { -1, -2 },
            { 2, 1 }, { -2, 1 }, { 2, -1 }, { -2, -1 } };

    public List<List<String>> solvedHorse(int n) {
        board = new int[n][n];
        // backtrack(0, 0, 1);
        btHelper(1);
        return ans;
    }

    private void btHelper(int count) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                backtrack(i, j, count);
            }
        }
    }

    private void backtrack(int row, int col, int count) {
        if (row == board.length && col == board.length && count == 16) { // при count > 16 ответ равен []
            addBoard();
            return;
        }

        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (canPlace(row, col)) {
                board[row][col] = count;
                backtrack(newRow, newCol, count + 1);
                board[row][col] = 0;
            }
        }

        // if (row == board.length && col == board.length && count > 16) {
        // addBoard();
        // return;
        // }

        // if (canPlace(row, col)) {
        // board[row][col] = count;
        // for (int[] move : moves) {
        // int newRow = row + move[0];
        // int newCol = col + move[1];
        // backtrack(newRow, newCol, count + 1);
        // }
        // board[row][col] = 0;
        // }
    }

    private boolean canPlace(int i, int j) {
        // for (int[] move : moves) {
        // int newRow = i + move[0];
        // int newCol = j + move[1];

        // if (newRow >= 0 && newRow < board.length && newCol >= 0 &&
        // newCol < board.length) {
        // if (board[newRow][newCol] != 0) {
        // return false;
        // } else {
        // return true;
        // }
        // }

        if (i >= 0 && i < board.length && j >= 0 &&
                j < board.length && board[i][j] == 0) {
            return true;
        } else {
            return false;
        }
        // }
    }

    private void addBoard() {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(String.valueOf(board[i][j]));
                sb.append(" ");
            }
            b.add(sb.toString());
        }
        ans.add(b);
    }
}
