package feb4;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // peek - see the top most element without removing it
        System.out.println(stack.peek());

        // pop - removes the element
        Integer pop = stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());


    }
}
