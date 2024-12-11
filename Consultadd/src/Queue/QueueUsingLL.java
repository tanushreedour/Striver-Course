package Queue;

class Node
{
    int data;
    Node next;
    Node prev;
    Node()
    {

    }
    Node(int data)
    {
        this.data = data;
    }
}
class queue
{
    Node front;
    Node rear;
    int size;
    queue()
    {
        this.size = 0;
        front = null;
        rear = null;
    }
    public void push(int data)
    {
        Node node = new Node(data);
        if(front == null && rear == null)
        {
            front = node;
            rear = node;
        }
        rear.next = node;
        node.prev = rear;
        rear = rear.next;
        size++;
    }
    public int pop()
    {
        if(front == null)
        {
            return -1;
        }
        if(front.next == null)
        {
            return front.data;
        }
        int val = front.data;
        front = front.next;
        front.prev = null;
        size--;
        return val;
    }
    public int top()
    {
        if(front == null)
        {
            return -1;
        }
        return front.data;
    }
    public int size()
    {
        return size;
    }
}
public class QueueUsingLL {
    public static void main(String[] args) {
        queue q = new queue();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        q.push(60);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
