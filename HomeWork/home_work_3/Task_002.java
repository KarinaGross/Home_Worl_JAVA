package home_work_3;

import java.util.ArrayList;
import java.util.List;

public class Task_002 {
    public static void main() {
        Solution sol = new Solution();
        List<List<Integer>> result = sol.combine(4, 2);
        System.out.println(result);
    }

    // public List<List<Integer>> combine(int n, int k) {
    //             ArrayList arr = new ArrayList<>();
                
                
    //             int var;
        
    //             if (var == n) {
    //                 return;
    //             }
        
    //             listOfLists.add({var, var + 1});
    //             List<List<Integer>> listOfLists = new ArrayList();
    //             List<Integer> element = new ArrayList();
    //             arr.
    //             listOfLists.add(null)
        
    //         }
}

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subList = new ArrayList<>(k);
        // int cur1 = 0;
        // int cur2 = cur1 + 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                subList.add(i+1);
                subList.add(j+1);
                ans.add(subList);
                // subList.clear();
            }
        }
        return ans;
    }
}
