package home_work_4;

import java.util.Stack;

public class Task_0001 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "((";
        boolean result = sol.isValid(s);
        System.out.println(result);
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> symbols = new Stack<>();

        if (s.length() % 2 != 0) {
            return false;
        }
        for (char symb : s.toCharArray()) {
            if (symb == '(' || symb == '[' || symb == '{') {
                symbols.push(symb);
            } else {
                if(!symbols.isEmpty() && symb == ')' && symbols.peek() == '(') {
                    symbols.pop();
                } else if(!symbols.isEmpty() && symb == ']' && symbols.peek() == '[') {
                    symbols.pop();
                } else if(!symbols.isEmpty() && symb == '}' && symbols.peek() == '{') {
                    symbols.pop();
                } else {
                    return false;
                }
            }
        }
        return symbols.isEmpty();
        
    }
}
