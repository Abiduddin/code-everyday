package collection.framework;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        display(stack);
        stack.pop();
        display(stack);
        stack.pop();
        stack.push(16);
        display(stack);
    }

    private static void display(Stack<Integer> stack) {
        for (var i : stack)
            System.out.print(i + " ");
        System.out.println();
    }
}
