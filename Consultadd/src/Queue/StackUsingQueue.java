package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    ArrayDeque<Integer> q = new ArrayDeque<Integer>();

    public void push(int data)
    {
        q.push(data);
        for(int i = 1; i < q.size(); i++)
        {
            q.push(q.pop());
        }
    }
    public int pop()
    {
        if(q.isEmpty())
        {
            return -1;
        }
        return q.pop();
    }
    public int top()
    {
        if(q.isEmpty())
        {
            return -1;
        }
        return q.peek();
    }
    public int size()
    {
        return q.size();
    }

    public static void main(String[] args) {
        StackUsingQueue obj = new StackUsingQueue();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.push(70);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
