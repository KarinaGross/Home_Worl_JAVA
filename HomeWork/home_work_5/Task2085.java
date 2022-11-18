package home_work_5;

import java.util.HashMap;
import java.util.Map;

public class Task2085 {
    public static void main(String[] args) {
        String[] words1 = new String[] {"leetcode","is","amazing","as","is"};
        String[] words2 = new String[] {"amazing","leetcode","is"};
        Solution3 sol = new Solution3();
        int result = sol.countWords(words1, words2);
        System.out.println(result);
    }
}

class Solution3 {
    public int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word : words1) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }

        for (String word : words2) {
            if (map.containsKey(word) && map.get(word) <= 1) {
                map.put(word, map.get(word) - 1);
            }
        }

        int count = 0;
        for (int value : map.values()) {
            if (value == 0) {
                count++;
            }
        }

        return count;
    }
}
