// Last updated: 17/07/2026, 15:11:28
import java.util.*;
class MyQueue {
private Stack<Integer> input;
private Stack<Integer> output;
    public MyQueue() {
        input=new Stack<>();
        output=new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if (output.isEmpty())
        transfer();
        return output.pop();
    }
    
    public int peek() {
        if (output.isEmpty())
        {
            transfer();
        }
        return output.peek();
        
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
     private void transfer() {
        while (!input.isEmpty()) {
            output.push(input.pop());
        }
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