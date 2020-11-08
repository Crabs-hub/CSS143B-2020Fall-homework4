package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        // homework
        stack = reverse(stack);
    }
    public static Stack<Integer> reverse(Stack<Integer> stack){
        if(stack.size() > 0){
            Integer hold = stack.peek();
            stack.pop();
            stack = reverse(stack);
            stack = insert(stack, hold);
        }
        return stack;
    }
    public static Stack<Integer> insert(Stack<Integer> stack, Integer hold){
        if(stack.isEmpty()){
            stack.push(hold);
        }else{
            Integer hold2 = stack.peek();
            stack.pop();
            stack = insert(stack, hold);
            stack.push(hold2);
        }
        return stack;
    }
}