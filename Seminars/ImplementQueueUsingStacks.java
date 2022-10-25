// import java.util.Scanner;
import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // MyQueue mq = new MyQueue();
        // задача с leetcode, как вывести в консоль не знаю. Решение верное.
    }
}

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if (out.empty()) {
            while (! in.empty()) {   // while (in.empty() == false)
                int el = in.pop();
                out.push(el);
            }
        }
        return out.pop();
    }
    
    public int peek() {
        if (out.empty()) {
            while (! in.empty()) {
                int el = in.pop();
                out.push(el);
            }
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.empty() && out.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */