package home_work_4;

import java.util.Stack;

public class Task_0002 {
    public static void main(String[] args) {
        String[] tokens = new String[] {"4","13","5","/","+"};
        Solution sol = new Solution();
        int result = sol.evalRPN(tokens);
        System.out.println(result);
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> numbers = new Stack<>();
        for (String item : tokens) {
            if ("+".equals(item)) {
                int a = Integer.valueOf(numbers.pop());
                int b = Integer.valueOf(numbers.pop());
                numbers.push(String.valueOf(a + b));
            }
            else if ("-".equals(item)) {
                int a = Integer.valueOf(numbers.pop());
                int b = Integer.valueOf(numbers.pop());
                numbers.push(String.valueOf(b - a));
            }
            else if ("*".equals(item)) {
                int a = Integer.valueOf(numbers.pop());
                int b = Integer.valueOf(numbers.pop());
                numbers.push(String.valueOf(a * b));
            }
            else if ("/".equals(item)) {
                int a = Integer.valueOf(numbers.pop());
                int b = Integer.valueOf(numbers.pop());
                numbers.push(String.valueOf(b / a));
            } else {
                numbers.push(item);
            }
        }
        return Integer.valueOf(numbers.pop());
    }
}