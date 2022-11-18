package home_work_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task350 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 2, 1};
        int[] nums2 = new int[] {2, 2};
        Solution2 sol = new Solution2();
        int[] result = sol.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}

class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums1) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        List<Integer> answer = new ArrayList<>();
        for (int num: nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                answer.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] res = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            res[i] = answer.get(i);
        }

        return res;
    }
}
