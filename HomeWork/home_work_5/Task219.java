package home_work_5;

import java.util.HashMap;
import java.util.Map;

public class Task219 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 1};
        int k = 3;
        Solution1 sol = new Solution1();
        boolean result = sol.containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }
}

class Solution1 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
               map.put(nums[i], i); 
            } else {
                int value = map.get(nums[i]);
                if (i - value <= k) {
                    return true;
                }
                map.put(nums[i], i);
            }
        }
        return false;
    }
}