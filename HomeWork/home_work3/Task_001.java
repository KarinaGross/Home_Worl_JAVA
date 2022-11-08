package home_work3;

import java.util.ArrayList;
import java.util.List;

public class Task_001 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<String>> result = sol.solvedHorse(5);
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
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                backtrack(i, j, 1);
            }
        }

        return ans;
    }

    private void backtrack(int row, int col, int count) {

        if (count > board.length * board.length - 1) {
            if (canPlace(row, col)) {
                board[row][col] = count;
                addBoard();
                board[row][col] = 0;
            }
            return;
        }

        for (int[] move : moves) {
            if (canPlace(row, col)) {
                board[row][col] = count;
                int newRow = row + move[0];
                int newCol = col + move[1];
                backtrack(newRow, newCol, count + 1);
                board[row][col] = 0;
            }
        }
    }

    private boolean canPlace(int i, int j) {
        if (i >= 0 && i < board.length && j >= 0 &&
                j < board.length && board[i][j] == 0) {
            return true;
        } else {
            return false;
        }
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