package Stack;

import java.util.Stack;

public class QueueFromStacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.add(23);
        stack1.add(13);
        stack1.add(88);
        stack1.add(34);
        stack1.add(78);
        stack1.add(4);
        stack1.add(21);
        stack1.add(90);
        stack1.add(32);
        stack1.add(12);

        while(!stack1.empty())
        {
            stack2.add(stack1.peek());
            stack1.pop();
        }

        while(!stack2.isEmpty())
        {
            System.out.println(stack2.peek());
            stack2.pop();
        }
    }
}
