package home_work_3;

import java.util.ArrayList;
import java.util.List;

public class Combinatoins {
    public static void main(String[] args) {
        Sol sol = new Sol();
        List<List<Integer>> result = sol.combine(9, 2);
        System.out.println(result);
    }
}


class Sol {
    List<List<Integer>> ans;

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        helper(new ArrayList<>(), n, k);
        return ans;
    }

    private void helper(List<Integer> comb, int n, int k) { // комбинации с повторениями
        if (comb.size() == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = 0; i <= n; i++) {
            comb.add(i);
            helper(comb, n, k);
            comb.remove(comb.size() - 1);
        }
    }
}
