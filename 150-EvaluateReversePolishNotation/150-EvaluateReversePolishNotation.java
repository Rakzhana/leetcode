// Last updated: 17/07/2026, 15:12:19
import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    int b1 = stack.pop();
                    int a1 = stack.pop();
                    stack.push(a1 - b1);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    int b2 = stack.pop();
                    int a2 = stack.pop();
                    stack.push(a2 / b2);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}