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
        List<List<Integer>> result = sol.solvedHorse(4);
        System.out.println(result);
    }

}

class Solution {
    int[][] board;
    List<List<Integer>> ans = new ArrayList<>();
    int[][] moves = { { 1, 2 }, { -1, 2 }, { 1, -2 }, { -1, -2 },
            { 2, 1 }, { -2, 1 }, { 2, -1 }, { -2, -1 } };
    int count = 1;

    public List<List<Integer>> solvedHorse(int n) {
        board = new int[n][n];
        backtrack(0, 0);
        return ans;
    }

    private void backtrack(int newRow, int newCol) {
        if (board[newRow][newCol] != 0) {
            addBoard();
            return;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                
            }
            
        }

        for (int[] move : moves) {
            int row = newRow + move[0];
            int col = newCol + move[1];

            if (canPlace(newRow, newCol)) { // не понимаю как менять точку отсчета
                board[row][col] = count; // проблема с индексом (-1)
                count++;
                backtrack(row, col);
                board[row][col] = 0;
                count--;
            }
        }

    }

    private boolean canPlace(int i, int j) {
        for (int[] move : moves) {
            int newRow = i + move[0];
            int newCol = j + move[1];

            if (newRow >= 0 && newRow < board.length && newCol >= 0 &&
                    newCol < board.length && board[newRow][newCol] == 0) {
                return true;
            }
        }

        return false;
    }

    private void addBoard() {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                // if (board[i][j] == 0) {
                // sb.append('.');
                // } else {
                // sb.append('Q');
                // }
                sb.append(board[i][j]);
            }
            b.add(sb.toString());
        }
    }
}