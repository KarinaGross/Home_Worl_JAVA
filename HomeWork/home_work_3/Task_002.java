package home_work_3;

import java.util.ArrayList;
import java.util.List;

public class Task_002 {
    static List<Integer> listIndex; 
    public static void main(String[] args) {
        String expr = "2? + ?5 = 69";
        String result = expression(expr);
        System.out.println(result);
    }

    public static String expression(String expr) {
        String newExpr = expr.replace(" ", "");
        char[] arrayExpr = newExpr.toCharArray();
        listIndex = new ArrayList<>();
        for (int i = 0; i < arrayExpr.length; i++) {
            if (arrayExpr[i] == '?') {
                listIndex.add(i);
            }
        }

    }

    public static void helper(int prev, List<Integer> index, int n, int k) {
        if (comb.size() == index.length) {
            ans.add(new ArrayList<>(comb));
        }

        for (int i = prev + 1; i < n + 1; i++) {
            comb.add(i);
            helper(i, comb, n, k);
            comb.remove(comb.size() - 1);
    }
}
