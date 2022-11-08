package home_work_4;

import java.util.Stack;

public class Task_0002 {
    public static void main(String[] args) {
        String[] tokens = new String[] {"4","13","5","/","+"};
        Sol sol = new Sol();
        int result = sol.evalRPN(tokens);
        System.out.println(result);
    }
}

class Sol {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (String item : tokens) {
            if ("+".equals(item)) {
                int a = numbers.pop();
                int b = numbers.pop();
                numbers.push(a + b);
            }
            else if ("-".equals(item)) {
                int a = numbers.pop();
                int b = numbers.pop();
                numbers.push(b - a);
            }
            else if ("*".equals(item)) {
                int a = numbers.pop();
                int b = numbers.pop();
                numbers.push(a * b);
            }
            else if ("/".equals(item)) {
                int a = numbers.pop();
                int b = numbers.pop();
                numbers.push(b / a);
            } else {
                numbers.push(Integer.valueOf(item));
            }
        }
        return numbers.pop();
    }
}