package Collection.Vactor;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katiya");
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.peek());
    }
}
