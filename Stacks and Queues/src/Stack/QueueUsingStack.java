package Stack;

import java.util.ArrayDeque;
import java.util.Queue;

class QueueUsingStack {
    Queue<Integer> first;

    public QueueUsingStack() {
        first = new ArrayDeque<>();
    }

    public void push(int x) {
        first.add(x);
        for(int i = 0 ; i < first.size() - 1 ; i++)
        {
            first.add(first.remove());
        }
    }

    public int pop() {
        return first.remove();
    }

    public int top() {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */