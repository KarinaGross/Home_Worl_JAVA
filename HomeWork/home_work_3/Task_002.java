package home_work_3;

import java.util.ArrayList;
import java.util.List;

public class Task_002 {
    static List<Integer> listIndex; 
    static List<List<Integer>> ans;
    public static void main(String[] args) {
        String expr = "2? + ?5 = 69";
        String result = expression(expr);
        System.out.println(result);
    }

    public static String expression(String expr) {
        expr = expr.replace(" ", "");
        char[] arrayExpr = expr.toCharArray();
        listIndex = new ArrayList<>();
        for (int i = 0; i < arrayExpr.length; i++) {
            if (arrayExpr[i] == '?') {
                listIndex.add(i);
            }
            if (arrayExpr[i] == '+') {
                arrayExpr[i] = '=';
            }
        }

        List<List<Integer>> comb = combine(listIndex.size());

        String res = "";
        for (List<Integer> list : comb) {
            if (chekout(arrayExpr, list)) {
                res = "Решение есть";
            } else {
                res = "Решений нет";
            }
        }
        return res;
    }

    public static List<List<Integer>> combine(int k) {
        ans = new ArrayList<>();
        helper(new ArrayList<>(), k);
        return ans;
    }

    private static void helper(List<Integer> comb, int k) { // комбинации с повторениями
        if (comb.size() == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            helper(comb, k);
            comb.remove(comb.size() - 1);
        }
    }

    public static boolean chekout(char[] exprchar, List<Integer> comb) {
        for (int i = 0; i < listIndex.size(); i++) {
            int num = comb.get(i);
            exprchar[listIndex.get(i)] = (char) num;
        } 
        String newexpr = String.valueOf(exprchar);
        String[] exprarray = newexpr.split("=");

        List<Integer> numbers = new ArrayList<>();
        for (String str : exprarray) {
            int num = Integer.parseInt(str);
            numbers.add(num);
        }

        return numbers.get(0) + numbers.get(1) == numbers.get(2);
    }
}
