package home_work_3;

import java.util.ArrayList;
import java.util.List;

public class Task_002 {
    static List<Integer> listIndex; 
    static List<List<Integer>> combinations;
    static List<Object> ans = new ArrayList<Object>();
    public static void main(String[] args) {
        String expr = "2? + ?5 = 69";
        List<Object> result = expression(expr);
        System.out.println(result);
    }

    public static List<Object> expression(String expr) {
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


        for (List<Integer> list : comb) {
            chekout(arrayExpr, list);
        }

        return ans;
        
    }

    public static List<List<Integer>> combine(int k) {
        combinations = new ArrayList<>();
        helper(new ArrayList<>(), k);
        return combinations;
    }

    private static void helper(List<Integer> comb, int k) { // комбинации с повторениями
        if (comb.size() == k) {
            combinations.add(new ArrayList<>(comb));
            return;
        }

        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            helper(comb, k);
            comb.remove(comb.size() - 1);
        }
    }

    public static void chekout(char[] exprchar, List<Integer> comb) {
        for (int i = 0; i < listIndex.size(); i++) {
            int num = comb.get(i);
            exprchar[listIndex.get(i)] = (char) (num + '0'); // нашла в интернете, как перевести int в его символьное представление
        } 
        String newexpr = String.valueOf(exprchar);
        String[] exprarray = newexpr.split("=");

        List<Integer> numbers = new ArrayList<>();

        for (String str : exprarray) {
            int num = Integer.valueOf(str.trim());
            numbers.add(num);
        }
        
        if (numbers.get(0) + numbers.get(1) == numbers.get(2)) {
            desisions(numbers);
        }
        
    }

    public static void desisions(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.valueOf(numbers.get(0)));
        sb.append("+");
        sb.append(String.valueOf(numbers.get(1)));
        sb.append("=");
        sb.append(String.valueOf(numbers.get(2)));

        ans.add(sb);
    }
}
